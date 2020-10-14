package com.example.springdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
@ComponentScan(basePackages="com.example.springdemo")
@EnableJpaRepositories(basePackages="com.example.springdemo.repo")
@EntityScan(basePackages="com.example.springdemo.bean.jpa")
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	
	@Bean
	public ModelMapper getmodelmapper() {

		return new ModelMapper();

	}

}