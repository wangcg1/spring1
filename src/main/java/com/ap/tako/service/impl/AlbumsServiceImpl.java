package com.ap.tako.service.impl;

import org.springframework.stereotype.Service;

import com.ap.tako.entity.Albums;
import com.ap.tako.service.IAlbumsService;

@Service
public class AlbumsServiceImpl extends BaseServiceImpl implements
		IAlbumsService {

	@Override
	public Albums get(Long id) {
		Albums albums = dao.get(Albums.class, id);
		return albums;
	}

}
