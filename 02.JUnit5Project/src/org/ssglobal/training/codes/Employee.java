package org.ssglobal.training.codes;

public class Employee {

	private String 	fName;
	private String 	lName;
	private Integer age;
	private Float	salary;	
	
	public Employee(String fName, String lName, Integer age, Float salary) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.salary = salary;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	
}
