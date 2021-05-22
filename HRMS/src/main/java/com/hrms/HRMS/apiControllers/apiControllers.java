package com.hrms.HRMS.apiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.HRMS.business.abstracts.EmployeeService;
import com.hrms.HRMS.entities.concretes.Employees;

@RestController
@RequestMapping("/api/emplooyes")

public class apiControllers 
{
	public apiControllers() {
		super();
	}
	private EmployeeService employeeService;

	public apiControllers(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/getall")
	public List<Employees>getAll()
	{
		return this.employeeService.getAll();
	}
}
