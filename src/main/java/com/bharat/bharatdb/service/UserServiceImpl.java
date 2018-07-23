package com.bharat.bharatdb.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bharat.bharatdb.dao.BhratCrud;
import com.bharat.bharatdb.entity.ResponseDTO;
import com.bharat.bharatdb.entity.User;
@Component
public class UserServiceImpl implements UserService{
	@Autowired
	private BhratCrud bharat;
	@Override
	public List<User> getAllUserList() {
		return bharat.findAll();
	}
	@Override
	public User getUserDetail(Long id) {
		
		return bharat.findByUserId(id);
	}
	@Override
	public ResponseDTO saveUserDetail(@Valid User user) {
		try {
			bharat.save(user);
		return new ResponseDTO(user);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseDTO(e.getMessage(),500);
		}
	}
	@Override
	public ResponseDTO updateUserDetail(@Valid User user) {
		try{
			System.out.println(user.getPhno());
		user.setUsername(user.getUsername());
		user.setPhno(user.getPhno());
		user.setRole(user.getRole());
		user.setPassword(user.getPassword());
		bharat.save(user);
		return new ResponseDTO(user);
		}catch(Exception e) {
			return new ResponseDTO(e.getMessage(),500);
		}
		
	}
	@Override
	public User deleteUserDetail(Long id) {
		User user=bharat.findByUserId(id);
		bharat.delete(user);
		return user;
	}

}
