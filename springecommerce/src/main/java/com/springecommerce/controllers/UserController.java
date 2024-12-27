package com.springecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springecommerce.dto.UsersDTO;
import com.springecommerce.services.UsersServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UsersServices userServices;
	
	@GetMapping(value="/GetDataUser", produces="application/json")
	public UsersDTO getUserDetails(@RequestParam("uname") String uname) {
		System.out.println(uname);
		return userServices.getUserByName(uname);
		
	}

}
