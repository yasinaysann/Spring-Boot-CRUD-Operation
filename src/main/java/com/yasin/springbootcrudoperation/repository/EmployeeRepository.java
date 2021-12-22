package com.yasin.springbootcrudoperation.repository;

import com.yasin.springbootcrudoperation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
