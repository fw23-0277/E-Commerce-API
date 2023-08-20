package com.ecommerce.service;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;

public interface UserService {
	
	/**
	 * This method for find user using user id 
	 * @param userId
	 * @return User 
	 */
	public User findUseById(Long userId) throws UserException;
	
	
	/**
	 * This method find user profile using jwt 
	 * @param jwt
	 * @return User 
	 * @throws UserException
	 */
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	
}	
