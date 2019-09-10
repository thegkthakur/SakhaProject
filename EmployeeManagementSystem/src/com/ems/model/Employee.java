package com.ems.model;

import java.time.LocalDate;

public class Employee {

	String empId;
	String empName;
	LocalDate dob;
	float basicSalary;
	
	public Employee() {}
	

	
	public Employee(String empId, String empName, LocalDate dob, float basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.basicSalary = basicSalary;
	}


	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	
	
	
	
	
}
