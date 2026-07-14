package com.kodewala.bean_java_type_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.name.Name;
import com.kodewala.name.config.NameConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(NameConfig.class);
    	Name n1 = (Name) iocContainer.getBean("name1");
    	Name n2 = (Name) iocContainer.getBean("name2");
    	
    	n1.fullName();
    	n2.fullName();
    }
}
