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
    public Customer findById(Integer id) {
        Customer customer = null;
        try {
            customer = customerRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return customer;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(Integer id, Customer customer) {
        Customer oldCustomer = findById(id);
        oldCustomer.setFullName(customer.getFullName());
        oldCustomer.setPhone(customer.getPhone());
        oldCustomer.setPassword(customer.getPassword());
        oldCustomer.setEmail(customer.getEmail());
        customerRepository.save(oldCustomer);
    }

    @Override
    public void delete(Integer id) {
        Customer customer = findById(id);
        if (customer != null)
            customerRepository.delete(customer);
    }

}
