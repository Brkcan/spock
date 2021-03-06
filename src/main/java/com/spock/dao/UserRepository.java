package com.spock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spock.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
	
}
