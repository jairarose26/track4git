package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class DbEmployee {
	
	private List<Employee> empTable;
	
	public DbEmployee() {
		this.empTable = new ArrayList<Employee>();
	}
	

	public List<Employee> addEmployee (String fname, String lname, Integer age, Float salary) {
		
		this.empTable.add( new Employee(fname, lname, age, salary) );
		return this.empTable;		
	}
}
