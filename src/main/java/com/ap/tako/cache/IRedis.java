package com.ap.tako.cache;

import java.util.List;

public interface IRedis {

	public void setString(String key, String value);
	
	public void setString(String key, String value, int seconds);

	public String getString(String key);
	
	public void deleteString(String key);
	

	public void set(String pk, Object obj, int seconds);
	public Object get(String pk, Class<?> clazz);
	public void delete(String pk);
	
	
	public Long listLength(String key);
	
	/**
	 * 从左边队头存
	 * @param key
	 * @param value
	 */
	public void listLeftPush(String key, Object value);
	
	/**
	 * 从左边队头取
	 * @param key
	 * @param clazz
	 * @return
	 */
	public Object listLeftPop(String key, Class<?> clazz);
	
	public void listRemove(String key, Object value);
	
	public void listRemoveAll(String key);
	
	/**
	 * 取出范围内的对象 
	 * 从0开始为第一个对象 ： listRange(key,0,0)即取出头部的第一个对象
	 * @param key
	 * @param start
	 * @param end
	 */
	public List<String> listRange(String key, long start, long end);
	
	public String getApp();

	public void setApp(String app);
	
	
}
