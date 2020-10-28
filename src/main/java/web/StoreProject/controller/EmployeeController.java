package web.StoreProject.controller;

import org.springframework.web.bind.annotation.*;
import web.StoreProject.entity.Employee;
import web.StoreProject.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Employee employee) {
        employeeService.create(employee);
    }

    @PostMapping("/update/{id}")
    public void update(@PathVariable Integer id, @RequestBody Employee employee) {
        employeeService.update(id, employee);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.delete(id);
    }
}
