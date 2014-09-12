package com.ap.tako.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ap.tako.cache.IRedis;
import com.ap.tako.entity.Tracks;
import com.ap.tako.model.TracksInfo;
import com.ap.tako.service.ITracksService;



@Controller
@RequestMapping("/")
public class TestController {
	
	private Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ITracksService tracksService;
	@Autowired
	IRedis redis;
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public 
	void test(
			HttpServletRequest request,
			HttpServletResponse response) {
		
		List<TracksInfo> lists = tracksService.getTracks(0,100);
		
		log.info(" lists =  "+ lists);
		
//		String value = redis.getString("test");
//		
//		log.info("redis value = " + value);
		
		
	}
	
}
