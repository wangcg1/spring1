package com.ap.tako.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.ap.tako.cache.IRedis;
import com.ap.tako.dao.IMasterCommonDAO;
import com.ap.tako.dao.ISlaveCommonDAO;


public class BaseServiceImpl {
	
	@Autowired
	protected IMasterCommonDAO dao;

	@Autowired
	protected IRedis redis;

//	@Resource(name="slaveCommonDAO")
//	protected ISlaveCommonDAO sdao;
	
	
	
}
