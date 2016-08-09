package com.globant.billing.client.web.service;

import java.util.List;

import com.globant.billing.client.web.model.Employee;

public interface EmployeeService {

	public long createEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long id);

	public List<Employee> getAllEmployees();

	public Employee getEmployee(long id);

	public List<Employee> getAllEmployees(String employeeName);

}
