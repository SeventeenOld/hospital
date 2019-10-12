package com.zhiyou100.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.LoginMapper;
import com.zhiyou100.model.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper mapper;
	
	
	public User findUser(String userName) {
		// TODO Auto-generated method stub
		return mapper.findUser(userName);
	}

}
