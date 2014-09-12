package com.ap.tako.cache;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final ObjectMapper simple_mapper = new ObjectMapper();
	
	static {
		mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		simple_mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
	}
	
	public static String toJson(Object o){
		try {
			String r = mapper.writeValueAsString(o);
			return r;
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}
	
	public static <T> T fromJson(String src, Class<T> t){
		try {
			return mapper.readValue(src, t);
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}

	public static String toSimpleJson(Object o){
		try {
			String r = simple_mapper.writeValueAsString(o);
			return r;
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}
	
	public static <T> T fromSimpleJson(String src, Class<T> t){
		try {
			return simple_mapper.readValue(src, t);
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}

	
}

class JsonException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public JsonException(Exception e) {
		super(e);
	}
	
}