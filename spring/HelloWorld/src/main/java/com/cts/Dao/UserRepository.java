package com.cts.Dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.User;

public interface UserRepository extends CrudRepository<User,String>{

	

}
