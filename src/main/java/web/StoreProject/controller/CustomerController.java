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

    @PostMapping("/create")
    public void create(@RequestBody Customer customer){
        customerService.create(customer);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        customerService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Customer customer){
        customerService.update(id,customer);
    }
}
