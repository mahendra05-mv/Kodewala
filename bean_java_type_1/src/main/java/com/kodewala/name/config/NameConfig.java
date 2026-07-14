package com.kodewala.name.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.name.Name;

@Configuration
public class NameConfig {
	
	@Bean("name1")
	public Name createName1()
	{
		Name n1 = new Name();
		n1.setFirstName("Mahendra");
		n1.setLastName("Vishnoi");
		return n1;
	}
	
	@Bean("name2")
	public Name createName2()
	{
		Name n2 = new Name();
		n2.setFirstName("Shubham");
		n2.setLastName("Bansal");
		return n2;
	}

}
