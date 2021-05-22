package com.hrms.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.HRMS.entities.concretes.Employees;

public interface EmployeeDao extends JpaRepository<Employees, Integer>
{

}
