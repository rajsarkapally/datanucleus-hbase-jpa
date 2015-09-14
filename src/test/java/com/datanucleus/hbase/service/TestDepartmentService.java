package com.datanucleus.hbase.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.datanucleus.hbase.dao.Department;

public class TestDepartmentService {

	DepartmentService deptService;
	@Before
	public void setup(){
		deptService=new DepartmentService();
	}
	
	@Test
	public void testCreateDepartment() {
		Department dept = deptService.createDepartment("manufacturing");
		assertEquals("manufacturing", dept.getDeptName());
	}

}
