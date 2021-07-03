package com.student.config;

import org.springframework.context.annotation.Bean;

import com.student.domain.StudentAddress;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public StudentAddress getAddress() {
		StudentAddress address = new StudentAddress();
		address.setCity("Bharatpur");
		address.setPincode("321602");
		address.setState("Rajasthan");
		address.setCountry("India");
		return address;
	}
}
