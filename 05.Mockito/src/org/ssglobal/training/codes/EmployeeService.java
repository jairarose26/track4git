package org.ssglobal.training.codes;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	private EmployeeDao empDao;
	
	public EmployeeService () {
		
	}
	
	public EmployeeService (EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	public List<String> getAllFirstName() {
		return empDao.selectAllEmployees().stream().map( (rec) -> {
			return rec.getFirstName();
		}).collect(Collectors.toList());
	}
	
}
