package com.kodewala.bean_java_type_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bank.account.Account;
import com.kodewala.bank.account.BeanConfiguration;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    	Account acc1 = (Account) iocContainer.getBean("savings");
    	Account acc2 = (Account) iocContainer.getBean("current");
    	
    	acc1.deposit(500);
    	acc1.withdraw(25000);
    	acc1.printAccountDetails();
    	
    	acc2.printAccountDetails();
    }
}
