package com.ecommerce.service;

import org.springframework.stereotype.Service;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User findUseById(Long userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
