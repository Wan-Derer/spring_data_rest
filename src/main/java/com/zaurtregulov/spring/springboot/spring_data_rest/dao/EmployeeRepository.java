package com.zaurtregulov.spring.springboot.spring_data_rest.dao;

import com.zaurtregulov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  // Из декларации класса spring-data-rest берёт тип Employee,
  // создаёт имя employees и REST-методы по умолчанию:
  // GET      employees               http://localhost:8080/employees
  // GET      employees/{employeeId}
  // POST     employees
  // PUT      employees/{employeeId}
  // DELETE   employees/{employeeId}
  // Для этих методов даже не надо создавать контроллер

//  List<Employee> findAllByName(String name);

}
