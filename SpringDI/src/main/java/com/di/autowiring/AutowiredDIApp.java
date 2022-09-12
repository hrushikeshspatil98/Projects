package com.di.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDIApp 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
		/*
		 * Employee e =new Employee(); e.setId(101); e.getEmpDetails();
		 */
        Employee employee = context.getBean("employee",Employee.class);
        employee.getEmpDetails();
    }
}
