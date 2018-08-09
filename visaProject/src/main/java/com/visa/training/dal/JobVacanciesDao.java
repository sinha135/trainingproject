package com.visa.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.visa.training.domain.JobVacancies;
//import com.visa.training.domain.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional

public class JobVacanciesDao {
    @Autowired
    EntityManager em;

    public List<JobVacancies> findAll() {

        Query q = em.createQuery("select p from JobVacancies p");
        List<JobVacancies> all = q.getResultList();
        return all;
    }

    public JobVacancies findOne(int id) {
        JobVacancies p = em.find(JobVacancies.class, id);
        return p;
    }

    public JobVacancies addNew(JobVacancies p) {
        em.persist(p);
        return p;
    }
}
