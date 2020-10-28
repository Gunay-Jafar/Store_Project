package web.StoreProject.service;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Customer;

import java.util.List;

@Service
public interface CustomerService {
    Customer findById(Integer id);

    List<Customer> findAll();

    void create(Customer customer);

    void update(Integer id, Customer customer);

    void delete(Integer id);
}
