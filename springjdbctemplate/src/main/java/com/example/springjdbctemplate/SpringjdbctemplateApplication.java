package com.example.springjdbctemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjdbctemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbctemplateApplication.class, args);
		
		TestDao dao = new TestDao();
		dao.getEmployeeUsingSimpleJdbcCall(400);
	}

}
