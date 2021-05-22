package com.hrms.HRMS.business.concretes;

import java.util.List;

import com.hrms.HRMS.business.abstracts.EmployeeService;
import com.hrms.HRMS.dataAccess.abstracts.EmployeeDao;
import com.hrms.HRMS.entities.concretes.Employees;

public class EmployeeManager implements EmployeeService
{
public EmployeeManager() {
		super();
	}

private EmployeeDao employeeDao;

	public EmployeeManager(EmployeeDao employeeDao) {
	super();
	this.employeeDao = employeeDao;
}

	@Override
	public List<Employees> getAll() 
	{
		
		return this.employeeDao.findAll();
	}

}
