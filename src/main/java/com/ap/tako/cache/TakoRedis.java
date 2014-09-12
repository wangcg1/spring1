/**
 * 多Key优化版本
 */

package com.ap.tako.cache;

import redis.clients.jedis.ShardedJedisPool;



public class TakoRedis extends SharedHashRedis implements IRedis {

	public TakoRedis(ShardedJedisPool shardedJedisPool) {
		super(shardedJedisPool);
	}
	
}
