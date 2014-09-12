package com.ap.tako.service;

import com.ap.tako.entity.Authorizations;

public interface IAuthorizationsService {
	
	public Authorizations getByAuid(String authorable_type,Long authorable_id);
	
}
