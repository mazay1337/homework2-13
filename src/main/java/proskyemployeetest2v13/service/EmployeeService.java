package proskyemployeetest2v13.service;

import proskyemployeetest2v13.model.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {
    Employee add(String firstName, String surName, int salary, int departmentId);

    Employee remove(String firstName, String surName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}