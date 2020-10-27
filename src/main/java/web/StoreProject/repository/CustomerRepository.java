package web.StoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.StoreProject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
