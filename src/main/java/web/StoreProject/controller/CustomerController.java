package web.StoreProject.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import web.StoreProject.entity.Customer;
import web.StoreProject.service.CustomerService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/customer")
@Api("Customer Controller")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get Customer by id,example : 51,74")
    public Customer findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/create")
    @ApiOperation(" Customer create")
    public void create(@RequestBody Customer customer){
        customerService.create(customer);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        customerService.delete(id);
    }

    @PostMapping("/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Customer customer){
        customerService.update(id,customer);
    }


}
