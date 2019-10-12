package com.zhiyou100.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.ResponseObject;
import com.zhiyou100.model.User;

@Service
public class AjaxServiceImpl implements AjaxService {

	public String checkUser(String usernameKey) {
		// TODO Auto-generated method stub
		String code = null;
		if(usernameKey !=null && usernameKey!="" || usernameKey=="admin") {
			//已注册 : 返回404
			code="{\"code\":\"404\"}";
		}else {
			//未注册
			code="{\"code\":\"200\"}";
		}
		return code;
	}

	public ResponseObject findUserById(String id) {
		// TODO Auto-generated method stub
		//假设能查到
		User user = new User();
		user.setUserName("张三");
		user.setPassword("123456");
		user.setEmail("231321@qq.com");
		
		//创建响应对象
		ResponseObject obj = new ResponseObject("200","成功",user);
		return obj;
	}

	public ResponseObject findDoctorBySectionId(String sectionId) {
		// TODO Auto-generated method stub
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		//写假数据
		if(sectionId!=null && sectionId !="") {
			if(sectionId.equals("1")) {
				doctors.add(new Doctor("k1张三"));
				doctors.add(new Doctor("k1李四"));
				doctors.add(new Doctor("k1王五"));
			}else if(sectionId.equals("2")) {
				doctors.add(new Doctor("k2张三"));
				doctors.add(new Doctor("k2李四"));
				doctors.add(new Doctor("k2王五"));
			}else if(sectionId.equals("3")){
				doctors.add(new Doctor("k3张三"));
				doctors.add(new Doctor("k3李四"));
				doctors.add(new Doctor("k3王五"));
			}
		}else {
			System.out.println("id不正确");
		}
		
		return new ResponseObject("200","成功",doctors);
	}

}
