package com.kodewala.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.employee.Employee;

@Configuration
public class BeanConfiguration {

	@Bean("emp1")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setEmpId(11416145);
		emp.setEmpName("Mahendra");
		emp.setSalary(364737);
		return emp;
	}
}
