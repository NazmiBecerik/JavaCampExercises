package com.hrms.HRMS.business.abstracts;

import java.util.List;

import com.hrms.HRMS.entities.concretes.Employees;

public interface EmployeeService 
{
	List<Employees> getAll();
}
