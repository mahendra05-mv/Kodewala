package com.kodewala.bean_xml_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.bean.Account;

public class App 
{
    public static void main( String[] args )
    {
    	String beanDefFile = "beans.xml";
    	ApplicationContext iocContainer = new ClassPathXmlApplicationContext(beanDefFile);
    	
    	Account account = (Account) iocContainer.getBean("acc");
    	
    	account.doSomething();
    }
}
