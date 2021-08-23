package org.ssglobal.training.codes;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestEmployeeService {

	@Mock
	private EmployeeDao empDao;
	
	@InjectMocks
	private EmployeeService empService;
	
	@BeforeEach
	public void setup() {
		empService = new EmployeeService(empDao);
	}
	
	@Test
	public void testGetFirstnames() {
		List<Employee> allEmps = new ArrayList<>(
				Arrays.asList( new Employee("Anna", "Diluk", 15000.00),
							   new Employee("Lorna", "Diluk", 25000.00),
							   new Employee("Fe", "Diluk", 55000.00) ));
		
		
		when( empDao.selectAllEmployees() ).thenReturn(allEmps);
		
		List<String> result = empService.getAllFirstName();
		List<String> names = new ArrayList<>(Arrays.asList("Anna", "Lorna", "Fe"));
		
		System.out.println(result);
		System.out.println(names);
		
		Assertions.assertIterableEquals(result, names);
		verify(empDao, times(1)).selectAllEmployees();
	}
	
	
	@AfterEach
	public void teardown() {
		empService = null;
		empDao = null;
	}
	
}
