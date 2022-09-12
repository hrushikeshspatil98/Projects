package com.di.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDIApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_config.xml");
	/* Without Spring :
	 * Employee e =new Employee(); e.setId(101); e.getEmpDetails();
	 */
        Employee employee = context.getBean("emp",Employee.class);
        employee.getEmpDetails();
    }
}
