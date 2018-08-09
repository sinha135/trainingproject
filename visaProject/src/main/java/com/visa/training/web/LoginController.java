package com.visa.training.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.dal.CredentialsDao;
import com.visa.training.dal.EmployeeDao;
import com.visa.training.domain.Credentials;
import com.visa.training.domain.Employee;
@Controller
public class LoginController {
	@Autowired
	CredentialsDao dao;
	@Autowired
	EmployeeDao edao;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String handleFormSubmission(HttpSession session,@RequestParam("eid")int eid,@RequestParam("password")String password){
		//String username= request.getParameter("user");
		//String password = request.getParameter("password");
		
		Credentials c= dao.findOne(eid);
		if(c==null){
			return "loginfail";
		}
		else if (c.getPassword().equals(password)){
			Employee e=edao.findOne(eid);
			session.setAttribute("eid", eid);
			session.setAttribute("name", e.getName());
			session.setAttribute("type", c.getDiscriminator());
			if(c.getDiscriminator().equalsIgnoreCase("hr"))
			return "hrportal";
			else return "empportal";
		}
		else return "loginfail";
		}
}

