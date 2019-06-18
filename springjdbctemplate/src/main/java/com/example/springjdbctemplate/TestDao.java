package com.example.springjdbctemplate;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class TestDao {
	@Autowired
	private DataSource datasource;
	
	public Employee getEmployeeUsingSimpleJdbcCall(int id) {
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(datasource)
                .withProcedureName("readEmployee");
	    SqlParameterSource in = new MapSqlParameterSource().addValue("input_id", id);
	    Map<String, Object> out = simpleJdbcCall.execute(in);
	 
	    Employee emp = new Employee();
	    emp.setName((String) out.get("name"));
	    
	    System.out.println("Employee Name===>"+emp.getName());
	    return emp;
	}

}

class Employee
{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String department, int salary)
	{
		this.setId(id);
		this.setName(name);
		this.setDepartment(department);
		this.setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
