package web.StoreProject.controller;

import org.springframework.web.bind.annotation.*;
import web.StoreProject.entity.Customer;
import web.StoreProject.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer readById(@PathVariable Integer id) {
        return customerService.readById(id);
    }

    @GetMapping("/readAll")
    public List<Customer> readAll() {
        return customerService.readAll();
    }
}
