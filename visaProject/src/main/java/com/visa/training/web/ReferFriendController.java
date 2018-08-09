package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.dal.JobReferralsDao;
import com.visa.training.dal.JobVacanciesDao;
import com.visa.training.domain.JobVacancies;

@Controller
public class ReferFriendController {
	@Autowired
    JobVacanciesDao dao;
	//@Autowired
	//JobReferralsDao jrdao;
	@RequestMapping(value="/refer/{id}",method = RequestMethod.GET)
	public ModelAndView handlerefer(HttpSession session,@PathVariable("id") int jid){
		System.out.println("[in get of /refer/id]");
		Map<String,Object> data = new HashMap<String,Object>();
		System.out.println(jid);
		JobVacancies jv= dao.findOne(jid);
		data.put("jid", jid);
		data.put("title",jv.getTitle());
		data.put("location",jv.getLocation() );
		return new ModelAndView("referfriend",data);
		
		
		
	}
	@RequestMapping(value="/refer" ,method = RequestMethod.POST)
	public ModelAndView handlerefer(HttpSession session){
		System.out.println("[in post of /refer]");
		Map<String,Object> data = new HashMap<String,Object>();
		//System.out.println(jid);
		//JobVacancies jv= dao.findOne(jid);
		String message;
		message="Your Refernce was added";
		data.put("message", message);
		return new ModelAndView("empportal",data);
	}

}
