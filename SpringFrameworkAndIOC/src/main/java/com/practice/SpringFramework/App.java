package com.practice.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.Interface.SharingApp;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        SharingApp app = context.getBean("obj",SharingApp.class);
        app.share();
    }
}
