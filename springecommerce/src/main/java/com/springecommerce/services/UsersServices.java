package com.springecommerce.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springecommerce.dto.UsersDTO;
import com.springecommerce.entities.Users;
import com.springecommerce.repositries.UserRepository;

@Service
public class UsersServices implements InterfaceUsers {

	@Autowired
	UserRepository usersRepository;
	
	@Override
	public UsersDTO getUserByName(String username) {
		
		Users userEntity = usersRepository.getUser(username);
		System.out.println("userentity=" + userEntity.toString());
		UsersDTO dto = new UsersDTO();
		BeanUtils.copyProperties(userEntity, dto);
		System.out.println("dto = "+dto);
		return dto;

	}

}
