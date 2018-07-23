package com.bharat.bharatdb.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.bharatdb.entity.User;

public interface BhratCrud extends JpaRepository<User, Long> {

	User findByUserId(Long id);
	
	

}
