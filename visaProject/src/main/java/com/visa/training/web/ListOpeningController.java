package com.visa.training.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.dal.JobVacanciesDao;
import com.visa.training.domain.JobVacancies;

import java.util.*;

@Controller
public class ListOpeningController {
	@Autowired
	JobVacanciesDao dao;
	@RequestMapping(value="/listjobs", method=RequestMethod.GET)
	public ModelAndView handleFormSubmission(HttpSession session){
		Map<String, Object> data =new HashMap<String,Object>();
		List<JobVacancies> all = dao.findAll();
		data.put("jobs", all);
		return new ModelAndView("listopenings",data);
		
		
	}
	
}
