package com.visa.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visa.training.dal.CredentialsDao;
//import com.visa.training.dal.EmployeeDao;
import com.visa.training.domain.Credentials;
//import com.visa.training.domain.Employee;
@Controller
public class CredentialFormController {
	@Autowired
	CredentialsDao dao;
	@RequestMapping(value="/cre", method=RequestMethod.GET)
	public String handleFormSubmission(@ModelAttribute("Credentials") Credentials e){
		dao.addNew(e);
		
		
		return "employeeform";
	}
}
