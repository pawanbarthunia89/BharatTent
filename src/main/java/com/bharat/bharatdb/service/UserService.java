package com.bharat.bharatdb.service;

import java.util.List;

import javax.validation.Valid;

import com.bharat.bharatdb.entity.ResponseDTO;
import com.bharat.bharatdb.entity.User;

public interface UserService {

	List<User> getAllUserList();

	User getUserDetail(Long id);

	ResponseDTO saveUserDetail(@Valid User user);

	ResponseDTO updateUserDetail(@Valid User user);

	User deleteUserDetail(Long id);


}
