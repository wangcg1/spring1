/**
 * Json版本 Shared
 */
package com.ap.tako.cache;

import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


/**
 * 
 */
public class SharedHashRedis implements IRedis {

	public static Logger logger = LoggerFactory.getLogger(SharedHashRedis.class);
	
	public static final int FACTOR = 1000; 
	
	protected String app;
	protected ShardedJedisPool shardedJedisPool;
	
	public SharedHashRedis(ShardedJedisPool shardedJedisPool) {
		this.shardedJedisPool = shardedJedisPool;
	}

	public void setString(String key, String value) {
		setString(key, value, -1);
	}
	
	public String getString(String key) {
		if(null == key || "".equals(key.trim())) {
			return null;
		}
		String result = null;
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			result = shardedJedis.get(key);
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
		return result;
	}
	
	public void deleteString(String key) {
		if(null == key || "".equals(key.trim())) {
			return ;
		}
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			shardedJedis.del(key);
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
	}
	
	protected static String[] getEntityCacheKey(Class<?> clazz, Object pk) {
		
		String prefix = clazz.getSimpleName();
		String[] result = new String[2];
		
		//对多Key的数组Key进行处理
		if(pk instanceof Object[]) {
			Object[] pks = (Object[])pk;
			Long elememt0 = (Long)pks[0];
			Long firstKey = elememt0 / SharedHashRedis.FACTOR;
			Long secondKey = elememt0 % SharedHashRedis.FACTOR;
			pks[0] = firstKey;
			String pkStr = StringUtils.join(pks, ",");
			result[0] = prefix + pkStr; 
			result[1] =	secondKey.toString();
			
		} else {
			Long longKey = (Long)pk;
			
			Long firstKey = longKey / FACTOR;   
			Long secondKey = longKey % FACTOR;
			result[0] = prefix + firstKey; 
			result[1] =	secondKey.toString();
		}
		return result;
	}
	
	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	@Override
	public void setString(String key, String value, int seconds) {
		if(null == key || "".equals(key.trim()) || 
				null == value || "".equals(value.trim())) {
			return;
		}
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			shardedJedis.set(key, value);
			if(seconds > 0) {
				shardedJedis.expire(key, seconds);
			}
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
	}

	
	@Override
	public Long listLength(String key) {
		if(key==null) return 0L;
		
		ShardedJedis shardedJedis = null;
		Long length = 0L;
		try {
			shardedJedis = shardedJedisPool.getResource();
			length = shardedJedis.llen(key);
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
		return length;
	}

	@Override
	public void listLeftPush(String key, Object value) {
		if(null == key || null == value) {
			return;
		}
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			shardedJedis.lpush(key, JsonUtils.toJson(value));
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
	}

	@Override
	public Object listLeftPop(String key, Class<?> clazz) {
		if(null == key || null == clazz) {
			return null;
		}
		Object object = null;
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			String json = shardedJedis.lpop(key);
			if(StringUtils.isNotEmpty(json)) {
				object = JsonUtils.fromJson(json, clazz);
			}
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
		return object;
	}

	@Override
	public void listRemove(String key, Object value) {
		if(null == key || null == value) {
			return;
		}
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			//0 为全部删除
			shardedJedis.lrem(key, 0, JsonUtils.toJson(value));
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
	}

	@Override
	public void listRemoveAll(String key) {
		if(null == key) {
			return;
		}
		ShardedJedis shardedJedis = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			while(shardedJedis.llen(key)>0) {
				shardedJedis.lpop(key);
			}
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
	}
	
	

	@Override
	public List<String> listRange(String key, long start, long end) {
		if(null == key) {
			return null;
		}
		ShardedJedis shardedJedis = null;
		List<String> result = null;
		try {
			shardedJedis = shardedJedisPool.getResource();
			result =  shardedJedis.lrange(key, start, end);
			shardedJedisPool.returnResource(shardedJedis);
		} catch (Exception e) {
			shardedJedisPool.returnBrokenResource(shardedJedis);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void set(String pk, Object obj, int seconds) {
		if(obj==null || pk==null) return ;
		String objStr = JsonUtils.toJson(obj);
		setString(pk, objStr, seconds);
	}

	@Override
	public Object get(String pk, Class<?> clazz) {
		if(pk==null || clazz==null) return null;
		Object result = null;
		try {
			String objStr = getString(pk);
			if(objStr==null) return null;
			result = JsonUtils.fromJson(objStr, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void delete(String pk) {
		deleteString(pk);
	}

	


}
