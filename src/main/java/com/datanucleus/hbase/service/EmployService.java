package com.datanucleus.hbase.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.datanucleus.hbase.dao.Department;
import com.datanucleus.hbase.dao.Employ;

public class EmployService {

	public void createEmploy(String empName, String city, Department dept){
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("hbase-jpa-test");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = null;
	        Employ emp = new Employ(empName, city, dept);
	        tx = em.getTransaction();
	    
	        tx.begin();
	        em.persist(emp);
	        tx.commit();
		
	}
	
	public List getAllEmployees(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hbase-jpa-test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Query query =  em.createQuery("Select e from Employ e", Employ.class);
		List result = query.getResultList();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("size : " + result.size());
		
		return result;
	}
}
