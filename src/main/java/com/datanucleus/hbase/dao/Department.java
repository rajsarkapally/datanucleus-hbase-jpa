package com.datanucleus.hbase.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Department {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	long deptId;
	
	String deptName;
	
//	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
	Set<Employ> employees = new HashSet<Employ>();
	
	public Department(){};
	
	public Department(String deptname){
		this.deptName=deptname;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public Set<Employ> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employ> employees) {
		this.employees = employees;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
