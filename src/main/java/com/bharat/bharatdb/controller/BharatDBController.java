package com.bharat.bharatdb.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.bharatdb.entity.ResponseDTO;
import com.bharat.bharatdb.entity.User;
import com.bharat.bharatdb.service.UserService;

@RestController
@RequestMapping(value = "/bharat")
public class BharatDBController {

	
	private @Autowired UserService userService;
	
	@GetMapping
	public ResponseDTO getAllUsers(){
		return new ResponseDTO(userService.getAllUserList()); 
	}
	@GetMapping("{id}")
	public ResponseDTO getUserDetail(@PathVariable("id")Long id) {
		return new ResponseDTO(userService.getUserDetail(id));
	}
	@PostMapping("saveUser")
	public ResponseDTO saveUserDetail(@Valid @RequestBody User user) {
		return userService.saveUserDetail(user);
	}
	@PutMapping
	public ResponseDTO updateUserDetail(@Valid @RequestBody User user) {
		return userService.updateUserDetail(user);
	}
	
	@DeleteMapping("{id}")
	public User deleteUserDetail(@PathVariable("id")Long id) {
		return userService.deleteUserDetail(id);
	}
}
