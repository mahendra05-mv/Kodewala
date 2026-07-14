package com.kodewala.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.student.management.system.Student;

@Configuration
public class BeanConfig {

	@Bean("stu1")
	public Student createStudent()
	{
		Student s = new Student();
		s.setId(14);
		s.setMarks(88);
		s.setName("Mahendra");
		return s;
	}
}
