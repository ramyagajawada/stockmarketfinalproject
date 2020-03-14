package com.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.User;

public interface UserRepository extends CrudRepository<User,String> {
	


Optional<User> findByEmail(String email);

User findByUserNameAndPasswordAndConfirmed(String username, String password, String string);

	
}
