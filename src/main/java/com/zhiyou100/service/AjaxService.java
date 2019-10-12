package com.zhiyou100.service;

import com.zhiyou100.model.ResponseObject;

public interface AjaxService {
	
	String checkUser(String usernameKey);
	
	ResponseObject findUserById(String id);
	
	ResponseObject findDoctorBySectionId(String sectionId);
	
}
