package com.kodewala.bean_java_type_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.configuration.BeanConfiguration;
import com.kodewala.employee.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    	Employee e1 = (Employee) iocContainer.getBean("emp1");
    	
    	e1.work();
    }
}
