package com.springecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class Users {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="user_id")
//	Integer id;
	@Column(name="user_name")
	String userName;
	
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="contactno")
	Long contactNo;
	
	@Column(name="password")
	String password;
	
	@Override
	public String toString() {
		
		return "["
				+ " username" + userName
				+ " password" + password
				+ " email" + email
				+ " contactno" + contactNo 
				+" ]";
		
	}

}
