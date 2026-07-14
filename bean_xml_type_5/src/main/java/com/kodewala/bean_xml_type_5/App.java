package com.kodewala.bean_xml_type_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.practice.Practice1;
import com.kodewala.practice.Practice2;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
    	Practice1 pra1 = (Practice1) iocContainer.getBean("p1");
    	Practice2 pra2 = (Practice2) iocContainer.getBean("p2");
    	
    	System.out.println(pra1.getFirstName() + " " + pra2.getLastName());
    }
}
