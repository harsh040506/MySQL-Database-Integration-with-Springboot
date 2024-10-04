package com.example.mysqldatabaseintegration.Repository;

import com.example.mysqldatabaseintegration.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}