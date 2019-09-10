package com.ems.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ems.EmsConfig;
import com.ems.service.EmployeeService;

public class App {

	public static void main(String []args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(EmsConfig.class);
		EmployeeManagementApp app=context.getBean("emsapp",EmployeeManagementApp.class);
		
		try {
			app.addEmplyee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
