package org.ssglobal.training.codes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmployeeDao {

	private Connection conn;
	
	public void openConnet(String username, String password, String url) {
		try {
			this.conn = DriverManager.getConnection (username, password, url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Employee> selectAllEmployees() {
		List<Employee> emps = new ArrayList<>();
		
		try ( Statement stmt = conn.createStatement() ) {
			
			ResultSet dataset = stmt.executeQuery("SELECT * FROM employee");
			
			while (dataset.next()) {
				Employee rec = new Employee();
				rec.setFirstName( dataset.getString(0) );
				rec.setFirstName( dataset.getString(0) );
				rec.setFirstName( dataset.getString(0) );
				emps.add(rec);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}	
}

class Employee {
	private String firstName;
	private String lastName;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasstName() {
		return lastName;
	}

	public void setLasstName(String lastName) {
		this.lastName = lastName;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}