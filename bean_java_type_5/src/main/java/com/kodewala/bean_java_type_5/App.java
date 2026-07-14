package com.kodewala.bean_java_type_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.configuration.BeanConfiguration;
import com.kodewala.mobile.Mobile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    	Mobile mob = (Mobile) iocContainer.getBean("mob1");
    	mob.call();
    }
}
