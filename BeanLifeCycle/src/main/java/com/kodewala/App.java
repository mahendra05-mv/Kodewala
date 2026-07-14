package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.Config;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext iocContainer = new AnnotationConfigApplicationContext(Config.class);
    	Payment pay = (Payment) iocContainer.getBean("payment");
    	
    	System.out.println(pay.getPaymentId());
    	
    	Payment pay2 = (Payment) iocContainer.getBean("payment");
    	System.out.println(pay2.getPaymentId());
    	
    	System.out.println(pay == pay2);
    	
    	pay2.destroy();
    	iocContainer.close();
    }
}

	