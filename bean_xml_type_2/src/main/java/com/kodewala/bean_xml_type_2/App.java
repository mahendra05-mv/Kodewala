package com.kodewala.bean_xml_type_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.Account;

public class App 
{
    public static void main( String[] args )
    {
    	String xmlFileDef = "beans.xml";
    	ApplicationContext iocContainer = new ClassPathXmlApplicationContext(xmlFileDef);
    	
    	Account account = (Account) iocContainer.getBean("acc2");
    	
    	account.showAccount();
    	System.out.println(account.getMob());
    }
}
