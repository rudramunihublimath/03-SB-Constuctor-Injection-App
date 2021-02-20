package com.io.SBConstuctorInjectionApp.service;


import com.io.SBConstuctorInjectionApp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserDao dao;

	/* it will fail if we specify default constructor
	public UserService() {
		System.out.println("UserService - Default constructor");
	} */

	public UserService(UserDao dao) {
		System.out.println("UserService - Constructor");
		this.dao = dao;
	}

	public void printUserName(Integer id) {
		String name = dao.findByNameById(id);
		System.out.println(name);		
	}
}
