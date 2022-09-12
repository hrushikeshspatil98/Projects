package com.di.setterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDIApp 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("di_config.xml");
		/*
		 * Employee e =new Employee(); e.setId(101); e.getEmpDetails();
		 */
        Employee employee = context.getBean("emp",Employee.class);
        employee.getEmpDetails();
    }
}
