package com.visa.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.visa.training.domain.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//import com.visa.training.domain.Employee;



@Component
@Transactional

public class EmployeeDao {
	@Autowired
	EntityManager em;
	
	//public void setEm(EntityManager em) 
	//	this.em = em;
	//}	
	
public List<Employee> findAll(){
		
		Query q = em.createQuery("select p from Employee p");
		List<Employee> all = q.getResultList();
		return all;
	}
	
	
	public Employee findOne(int id){
		Employee p = em.find(Employee.class, id);
		return p;
	}
	public Employee addNew(Employee p){
		em.persist(p);
		return p;
	}

}
