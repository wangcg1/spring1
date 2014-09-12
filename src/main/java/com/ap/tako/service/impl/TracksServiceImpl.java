package com.ap.tako.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.tako.entity.Albums;
import com.ap.tako.entity.Authorizations;
import com.ap.tako.entity.People;
import com.ap.tako.entity.Tracks;
import com.ap.tako.entity.Users;
import com.ap.tako.model.TracksInfo;
import com.ap.tako.service.IAlbumsService;
import com.ap.tako.service.IAuthorizationsService;
import com.ap.tako.service.IPeopleService;
import com.ap.tako.service.ITracksService;
import com.ap.tako.service.IUsersService;
@Service
public class TracksServiceImpl extends BaseServiceImpl implements ITracksService {
	
	private Logger log = LoggerFactory.getLogger(TracksServiceImpl.class);
	
	@Autowired
	IAlbumsService albumsService;
	@Autowired
	IUsersService usersService;
	@Autowired
	IAuthorizationsService  authorizationsService;
	@Autowired
	IPeopleService peopleService;
	
	@Override
	public List<TracksInfo> getTracks(int start,int size) {
		
		List<TracksInfo> list = new ArrayList<TracksInfo>();
		

		String hql = "From Tracks";
		List<Tracks> tras = dao.getSQLList(hql, null, start, size);
		
		for(Tracks track : tras){
			
			Long albumId = track.getAlbum_id();
			Albums album = albumsService.get(albumId);
			
			Long uid = track.getUser_id();
			Users user = usersService.get(uid);
			
			Long trackid = track.getId();
			String type = "Track";
			
			Authorizations authorizations = authorizationsService.getByAuid(type, trackid);
			String name = "";
			int peopleId = 0;
			if(authorizations != null){
			     peopleId = authorizations.getPerson_id();
				
				People people = peopleService.get(Long.parseLong(peopleId + ""));
				name = people.getName();
			}else{
				log.info("type= " + type + " trackid = " + trackid + " authorizations is null ");
			}
			
			
			TracksInfo tinfo = new TracksInfo(track);
			tinfo.setAlbum_name(album.getName());
			tinfo.setUser(user.getEmail());
			tinfo.setPeople_name(name);
			tinfo.setPeople_id(peopleId);
			tinfo.setAlbum_hex(album.getHex());
			
			list.add(tinfo);
			
		}
		
		log.info(" finish ");
		
		return list;
	}
	


}
