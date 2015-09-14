package com.datanucleus.hbase.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.datanucleus.hbase.dao.Department;


public class DepartmentService {

	public Department createDepartment(String departmentName){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hbase-jpa-test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;

        Department dept = new Department(departmentName);

        
        tx = em.getTransaction();
    
        tx.begin();
        dept= em.merge(dept);
        tx.commit();
        return dept;
		
	}
	
	public List<Department> getdepartmentByName(String departmentName){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hbase-jpa-test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;

       Query query = em.createNamedQuery("select d from Department d where d.deptName='" + departmentName+"'");
       

        tx = em.getTransaction();
       
        
        tx.begin();
        List<Department> result = query.getResultList();
        tx.commit();
        return result;
		
	}
	
}
