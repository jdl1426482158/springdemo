package com.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRespositoryImpl implements UserRepository {
	public void save() {
		System.out.println("UserRespository save...");
	}
}
