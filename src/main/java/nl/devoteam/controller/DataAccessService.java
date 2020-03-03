package nl.devoteam.controller;

import nl.devoteam.model.Employee;
import nl.devoteam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataAccessService {
    @Autowired
    EmployeeRepo employeeRepo;


    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){
         employeeRepo.save(employee);
         return "employee Inserted successfully";
    }

    @GetMapping("/employee")
    public Employee getEmployeeById(@RequestParam Long id){
        return employeeRepo.findById(id).get();
    }
}
