package com.school.repertory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.school.repertory.dao"})
public class RepertoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepertoryApplication.class, args);
	}
}
