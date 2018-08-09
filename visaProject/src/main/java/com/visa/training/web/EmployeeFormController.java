package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.dal.EmployeeDao;
import com.visa.training.domain.Employee;

@Controller

public class EmployeeFormController {
	@Autowired
	EmployeeDao dao;
	@RequestMapping(value="/employeeEntry", method=RequestMethod.GET)
	public ModelAndView handleFormSubmission(@ModelAttribute("Employee") Employee e){
		dao.addNew(e);
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("eid",e.getEid());
		
		String viewName = "credentialform";
		return new ModelAndView(viewName,data);
	}
	
	
}
