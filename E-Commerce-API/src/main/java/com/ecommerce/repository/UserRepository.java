 package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	/**
	 * This method find user by email id
	 * @param email
	 * @return User 
	 */
	public User findByEmail(String email);
}
