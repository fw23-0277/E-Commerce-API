 package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;


@Repository  
public interface UserRepository extends JpaRepository<User, Long> {
	

	/**
	 * This method find user by email 
	 * @param email
	 * @return Optinal<User> this may be contain user or not  
	 */
	public Optional<User> findByEmail(String email);
}
