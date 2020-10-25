package web.StoreProject.service.impl;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Customer;
import web.StoreProject.repository.CustomerRepository;
import web.StoreProject.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

   private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer readById(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> readAll() {
        return customerRepository.findAll();
    }
}
