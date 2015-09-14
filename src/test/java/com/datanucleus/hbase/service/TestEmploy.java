package com.datanucleus.hbase.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import com.datanucleus.hbase.dao.Department;
import com.datanucleus.hbase.dao.Employ;


public class TestEmploy {
	

	DepartmentService deptService;
	EmployService empService;
	@Before
	public void setup(){
		deptService=new DepartmentService();
		empService= new EmployService();
	}

	@Test
	public void testEmpCreation(){
	
		 empService.createEmploy("Raj Sarkapally", "San Francisco", new Department("sales"));
		
	}
	
	@Test
	public void testReadAllEmployees(){
		
		List result = empService.getAllEmployees();
		
		Iterator it = result.iterator();
		
		System.out.println("No of employees : " + result.size());
		
		while(it.hasNext())
		{
			Employ employ = (Employ)it.next();
			System.out.println(employ.toString());
		}
		
	}

}
