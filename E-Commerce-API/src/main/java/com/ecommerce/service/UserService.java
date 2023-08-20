package com.ecommerce.service;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;
import com.ecommerce.request.LoginRequest;
import com.ecommerce.response.AuthResponse;

public interface UserService {
	
	
	
	/**
	 * This method for create new user 
	 * @param user
	 * @return response of AuthResponse class 
	 * @throws UserException
	 */
	public AuthResponse createUser(User user) throws UserException;
	
	
	public AuthResponse userLogin(LoginRequest loginRequest);
	
	
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
