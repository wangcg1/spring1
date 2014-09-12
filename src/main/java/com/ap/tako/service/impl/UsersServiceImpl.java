package com.ap.tako.service.impl;

import org.springframework.stereotype.Service;

import com.ap.tako.entity.Users;
import com.ap.tako.service.IUsersService;
@Service
public class UsersServiceImpl extends BaseServiceImpl implements IUsersService {

	@Override
	public Users get(Long id) {
		Users user = dao.get(Users.class, id);
		return user;
	}

}
