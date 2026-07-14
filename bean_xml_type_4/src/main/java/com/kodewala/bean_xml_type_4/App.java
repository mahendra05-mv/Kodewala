package com.kodewala.bean_xml_type_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.bean.Test;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
    	Test t = (Test) iocContainer.getBean("test");
    	
    	t.showData();
    }
}
