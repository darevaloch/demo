package com.globant.billing.client.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.globant.billing.client.web.model.Employee;
import com.globant.billing.client.web.util.HibernateUtil;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    
    public EmployeeDAOImpl() {
        System.out.println("EmployeeDAOImpl");
    }
    
    @Autowired
    private HibernateUtil hibernateUtil;


    public long createEmployee(Employee employee) {        
        return (Long) hibernateUtil.create(employee);
    }
    

    public Employee updateEmployee(Employee employee) {        
        return hibernateUtil.update(employee);
    }
    

    public void deleteEmployee(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        hibernateUtil.delete(employee);
    }
    

    public List<Employee> getAllEmployees() {        
        return hibernateUtil.fetchAll(Employee.class);
    }
    

    public Employee getEmployee(long id) {
        return hibernateUtil.fetchById(id, Employee.class);
    }

    @SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees(String employeeName) {
		String query = "SELECT e.* FROM Employees e WHERE e.name like '%" + employeeName + "%'";
		List<Employee> employeeObjects = hibernateUtil.fetchAll(query);
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee employeeObject : employeeObjects) {
			Employee employee = new Employee();
			long id = employeeObject.getId();
			// int age = (int) employeeObject[1];
			String name = employeeObject.getName();
			// float salary = (float) employeeObject[3];
			employee.setId(id);
			employee.setName(name);
			// employee.setAge(age);
			// employee.setSalary(salary);
			employees.add(employee);
		}
		System.out.println(employees);
		return employees;
	}
}