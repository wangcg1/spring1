package com.ap.tako.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ap.tako.entity.Authorizations;
import com.ap.tako.service.IAuthorizationsService;
@Service
public class AuthorizationsServiceImpl extends BaseServiceImpl implements IAuthorizationsService{

	@Override
	public Authorizations getByAuid(String authorable_type,Long authorable_id) {
		
		String sql = "FROM Authorizations WHERE authorable_type=? AND authorable_id=?";
		Object[] conditions = {authorable_type,authorable_id};
		List<Authorizations> lists = dao.getSQLList(sql, conditions, -1);
		
		if(lists == null || lists.size() == 0){
			return null;
		}
		
		return lists.get(0);
	}

}
