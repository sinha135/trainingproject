package com.visa.training.dal;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.visa.training.domain.Credentials;
//import com.visa.training.domain.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional

public class CredentialsDao {
	@Autowired
	EntityManager em;
	
public List<Credentials> findAll(){
		
		Query q = em.createQuery("select p from Credentials p");
		List<Credentials> all = q.getResultList();
		return all;
	}
	
	
	public Credentials findOne(int id){
		Credentials p = em.find(Credentials.class, id);
		return p;
	}
	public Credentials addNew(Credentials p){
		em.persist(p);
		return p;
	}
}
