package com.io.SBConstuctorInjectionApp.service;


import com.io.SBConstuctorInjectionApp.dao.ReportDao;
import com.io.SBConstuctorInjectionApp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserDao dao;
	private ReportDao reportDao;

	/* it will fail if we specify default constructor
	public UserService() {
		System.out.println("UserService - Default constructor");
	} */

	/*
	* Note: if 1 param and 2 param construtor is there then
	* we need specific which constructor to use bu using @Autowired at method level.
	* */

	public UserService(UserDao dao) {
		System.out.println("UserService - Constructor..");
		this.dao = dao;
	}

	@Autowired
	public UserService(UserDao dao, ReportDao reportDao) {
		System.out.println("UserService - 2 param Constructor..");
		this.dao = dao;
		this.reportDao = reportDao;
	}

	public void printUserName(Integer id) {
		String name = dao.findByNameById(id);
		System.out.println(name);		
	}
}
