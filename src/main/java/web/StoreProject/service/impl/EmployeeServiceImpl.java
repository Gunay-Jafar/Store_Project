package web.StoreProject.service.impl;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Employee;
import web.StoreProject.repository.EmployeeRepository;
import web.StoreProject.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findById(Integer id) {
        Employee employee = null;
        try {
            employee = employeeRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Integer id, Employee employee) {
        Employee oldEmployee=findById(id);
        oldEmployee.setFullName(employee.getFullName());
        oldEmployee.setEmail(employee.getEmail());
        oldEmployee.setBirthDate(employee.getBirthDate());
        oldEmployee.setPhone(employee.getPhone());
        oldEmployee.setStatus(employee.getStatus());
        employeeRepository.save(oldEmployee);
    }

    @Override
    public void delete(Integer id) {
        Employee employee=findById(id);
        if (employee!=null){
            employeeRepository.delete(employee);
        }
    }
}
