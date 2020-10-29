package web.StoreProject.service.impl;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Order;
import web.StoreProject.repository.OrderRepository;
import web.StoreProject.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findById(Integer id) {
        Order order = null;
        try {
            order = orderRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void create(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void update(Integer id, Order order) {
        Order oldOrder = findById(id);
        oldOrder.setDate(order.getDate());
        oldOrder.setCustomer(order.getCustomer());
        oldOrder.setProduct(order.getProduct());
        orderRepository.save(oldOrder);
    }

    @Override
    public void delete(Integer id) {
        Order order = findById(id);
        if (order != null)
            orderRepository.delete(order);
    }
}
