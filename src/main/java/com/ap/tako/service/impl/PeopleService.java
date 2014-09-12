package com.ap.tako.service.impl;

import org.springframework.stereotype.Service;

import com.ap.tako.entity.People;
import com.ap.tako.service.IPeopleService;
@Service
public class PeopleService extends BaseServiceImpl implements IPeopleService {

	@Override
	public People get(Long id) {
		People people = dao.get(People.class, id);
		return people;
	}


}
