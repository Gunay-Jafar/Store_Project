package web.StoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.StoreProject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
