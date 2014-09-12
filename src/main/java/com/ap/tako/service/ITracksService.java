package com.ap.tako.service;

import java.util.List;

import com.ap.tako.entity.Tracks;
import com.ap.tako.model.TracksInfo;

public interface ITracksService {
	
	/**
	 * 
	 * @param start 第一条数据 一般从0 开始
	 * @param size 这次取多少条数据 100，1000，或者10000
	 * @return
	 */
	public List<TracksInfo> getTracks(int start,int size);
	
}
