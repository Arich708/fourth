package com.arich.SpringPro1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arich.SpringPro1.model.Birthday;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicatio.xml"); 
        Birthday aman=context.getBean("info",Birthday.class);
        aman.wish();
    }
}
