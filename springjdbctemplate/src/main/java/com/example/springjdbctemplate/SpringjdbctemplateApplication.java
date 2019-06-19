package com.example.springjdbctemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjdbctemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbctemplateApplication.class, args);
		System.out.println("This is the changes");
		TestDao dao = new TestDao();
		dao.getEmployeeUsingSimpleJdbcCall(400);
	}

}
