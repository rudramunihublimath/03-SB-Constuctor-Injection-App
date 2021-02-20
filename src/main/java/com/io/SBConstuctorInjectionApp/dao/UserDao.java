package com.io.SBConstuctorInjectionApp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao constructor..");
	}

	public String findByNameById(Integer id) {
		if(id==101)
			return "John";
		else 
			return null;			
			
	}

}
