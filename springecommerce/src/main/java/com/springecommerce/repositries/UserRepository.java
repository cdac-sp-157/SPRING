package com.springecommerce.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springecommerce.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users , String> {

	@Query("select u from Users u where u.userName = :username")
	public Users getUser(@Param("username") String username);
	
}
