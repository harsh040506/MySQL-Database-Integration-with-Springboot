package com.example.mysqldatabaseintegration.Service.Impl;
//In Spring Data, the default postfix for custom repository implementations is "Impl".

import com.example.mysqldatabaseintegration.Model.Employee;
import com.example.mysqldatabaseintegration.Repository.EmployeeRepository;
import com.example.mysqldatabaseintegration.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee =  employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new RuntimeException()
        );
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        // save
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        //checking whether exists
        employeeRepository.findById(id).orElseThrow(()-> new RuntimeException());
        //delete
        employeeRepository.deleteById(id);
    }
}