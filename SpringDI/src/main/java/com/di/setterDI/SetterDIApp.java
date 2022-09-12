package com.di.setterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDIApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter_config.xml");
	/*  Without Spring :
	 * Employee e =new Employee(); e.setId(101); e.getEmpDetails();
	 */
        Employee employee = context.getBean("emp",Employee.class);
        employee.getEmpDetails();
    }
}
