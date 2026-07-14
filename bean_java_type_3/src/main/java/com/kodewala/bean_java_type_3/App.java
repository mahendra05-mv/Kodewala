package com.kodewala.bean_java_type_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.config.BeanConfig;
import com.kodewala.student.management.system.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer = new AnnotationConfigApplicationContext(BeanConfig.class);
    	Student s1 = (Student) iocContainer.getBean("stu1");
    	
    	s1.study();
    	s1.showResult();
    }
}
