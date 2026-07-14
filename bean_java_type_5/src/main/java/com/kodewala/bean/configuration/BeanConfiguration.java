package com.kodewala.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.mobile.Mobile;

@Configuration
public class BeanConfiguration {

	@Bean("mob1")
	public Mobile createMobile()
	{
		Mobile mob = new Mobile();
		mob.setCompany("iPhone");
		mob.setModel("17 Pro Max");
		mob.setBattery(4800);
		return mob;
	}
}
