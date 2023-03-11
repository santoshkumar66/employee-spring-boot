/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService; 

@RestController
public class EmployeeController{
    EmployeeService employeeService = new EmployeeService();
    
    @PutMapping("/employees/{employeeId}")

    public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId, employee);
    }
    
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    
    @GetMapping("/employees")
    public ArrayList<Employee>getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{employeeId}") 

    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
    
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId){
        employeeService.deleteEmployee(employeeId);
    }

} 

