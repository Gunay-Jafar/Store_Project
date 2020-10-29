package web.StoreProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.StoreProject.entity.Order;
import web.StoreProject.service.OrderService;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Integer id){
        return orderService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Order>findAll(){
        return orderService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Order order){
        orderService.create(order);
    }

    @PostMapping("/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Order order){
        orderService.update(id,order);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        orderService.delete(id);
    }


}
