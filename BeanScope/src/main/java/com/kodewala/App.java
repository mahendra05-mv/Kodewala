package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Payment pay = (Payment) iocContainer.getBean("payment");
    	System.out.println(pay.showPaymentId());
    	
    	Payment pay2 = (Payment) iocContainer.getBean("payment");
    	System.out.println(pay.showPaymentId());
    	
    	System.out.println(pay == pay2);
    	
    	ApplicationContext iocContainer2 = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Payment pay3 = (Payment) iocContainer2.getBean("payment");
    	
    	
    	System.out.println(pay == pay3);
    	
    }
}


