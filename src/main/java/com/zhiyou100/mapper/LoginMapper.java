package com.zhiyou100.mapper;

import com.zhiyou100.model.User;

public interface LoginMapper {
	
	User findUser(String userName);

}
