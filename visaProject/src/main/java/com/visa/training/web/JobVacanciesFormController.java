package com.visa.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visa.training.dal.JobVacanciesDao;
import com.visa.training.domain.JobVacancies;

@Controller
public class JobVacanciesFormController {
    @Autowired
    JobVacanciesDao dao;

    @RequestMapping(value = "/jobentry", method = RequestMethod.GET)
    public String handleFormSubmission(@ModelAttribute("JobVacancies") JobVacancies e) {
    	System.out.println(e.getJid());
    	System.out.println(e.getStatus());
    	System.out.println(e.getSalary());
        dao.addNew(e);
        return "hrportal";    }
}

