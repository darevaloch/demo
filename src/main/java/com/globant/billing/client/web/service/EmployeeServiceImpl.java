package com.globant.billing.client.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.globant.billing.client.web.dao.EmployeeDAO;
import com.globant.billing.client.web.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}

	@Autowired
	private EmployeeDAO employeeDAO;

	public long createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	public void deleteEmployee(long id) {
		employeeDAO.deleteEmployee(id);
	}

	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public Employee getEmployee(long id) {
		return employeeDAO.getEmployee(id);
	}

	public List<Employee> getAllEmployees(String employeeName) {
		return employeeDAO.getAllEmployees(employeeName);
	}
}