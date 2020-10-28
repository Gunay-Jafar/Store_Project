package web.StoreProject.service;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Employee;

import java.util.List;

@Service
public interface EmployeeService {

    Employee findById(Integer id);

    List<Employee> findAll();

    void create(Employee employee);

    void update(Integer id, Employee employee);

    void delete(Integer id);


}
