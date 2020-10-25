package web.StoreProject.service;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Customer;

import java.util.List;

@Service
public interface CustomerService {
    Customer readById(Integer id);

    List<Customer> readAll();
}
