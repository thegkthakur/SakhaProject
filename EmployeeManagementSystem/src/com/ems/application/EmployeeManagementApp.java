package com.ems.application;

import java.io.BufferedReader;
import java.io.IOException;

import com.ems.EmsConfig;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("emsapp")
public class EmployeeManagementApp {

	@Autowired
	EmployeeService es;
	
	@Autowired
	BufferedReader in;
	


	public EmployeeService getEs() {
		return es;
	}

	public void setEs(EmployeeService es) {
		this.es = es;
	}

	public BufferedReader getIn() {
		return in;
	}

	public void setIn(BufferedReader in) {
		this.in = in;
	}



	
	public void addEmplyee() throws Exception {
		
		String empName;
		LocalDate dob;
		float sal;
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter emplyee details(name,dob(dd-mm-yyyy),salary) : ");
		empName=in.readLine();
		String strDate=in.readLine();
		StringTokenizer stk=new StringTokenizer(strDate,"-");
		int date=Integer.parseInt(stk.nextToken());
		int month=Integer.parseInt(stk.nextToken());
		int year=Integer.parseInt(stk.nextToken());
		dob=LocalDate.of(year, month, date);
		sal=Float.parseFloat(in.readLine());
		
		Employee emp=new Employee();
		emp.setEmpName(empName);
		emp.setBasicSalary(sal);
		emp.setDob(dob);
		
		es.save(emp);
		
	}
	public void deleteEmployee()
	{
		
	}
	
	public void showEmployee() {
		
	}
	public void displayAll() {
		
	}
	public void updateEmployee() {
		
	}
	
	
	
}
