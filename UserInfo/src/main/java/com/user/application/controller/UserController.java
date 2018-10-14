package com.user.application.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.application.exception.InvalidUserException;
import com.user.application.service.UserService;

@RestController
public class UserController {
	
	@RequestMapping("/getUserDetail")
	public String getUserDetail(@RequestParam("userName")String userName)throws InvalidUserException{
		System.out.println("UserController.test()");
		new UserService().getUserInfo(userName);
		 		return "tested";
	}
	

}
