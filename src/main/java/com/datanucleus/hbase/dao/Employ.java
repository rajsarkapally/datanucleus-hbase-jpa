package com.datanucleus.hbase.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employ {


	  @Id
	  @GeneratedValue(strategy=GenerationType.TABLE)
	  long empId;
	  String empName;
	  String city;
	  @ManyToOne
	  Department dept;
	  
	  public Employ(){};
	  public Employ(String empName, String city, Department dept){
		  this.empName=empName;
		  this.city=city;
		  this.dept=dept;
	  }
	  
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	  
	  
	
}
