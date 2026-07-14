package com.kodewala.bean_xml_type_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.bean.Payment;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new ClassPathXmlApplicationContext("bean.xml");
    	Payment payment = (Payment) iocContainer.getBean("pay");
    	
    	System.out.println(payment.getBal());
    }
}
