package com.visa.training.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visa.training.dal.CredentialsDao;

@Controller
public class Logout {
	@Autowired
	CredentialsDao dao;
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String handleFormSubmission(HttpSession session){
		session.invalidate();
		return "loginpage";
	}
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public String handleFormSubmissions(HttpSession session){
		session.invalidate();
		return "loginpage";
	}
}
