package com.springecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
	
	String userName;
	String name;
	String email;
	Long contactNo;
	String password;
	
	@Override
	public String toString(){
		
		return "[ "
				+ " username = " + userName
				+ " name = " + name
				+ "email = " + email
				+ " contact no = " + contactNo
				+ " ]";
		
	}

}
