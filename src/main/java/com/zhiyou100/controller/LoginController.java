package com.zhiyou100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	@RequestMapping("loginUser")
	public String login(String userName, String password, Model model) {
		User user = service.findUser(userName);
		if (user != null) {
			if (password.equals(user.getPassword())) {
				model.addAttribute("user", user);
				return "index";
			} else {
				model.addAttribute("msg", "密码错误!");
				return "forward:login.jsp";
			}
		} else {
			model.addAttribute("msg", "用户不存在");
			return "forward:login.jsp";
		}
	}

}
