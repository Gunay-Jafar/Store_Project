package web.StoreProject.service;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Order;

import java.util.List;

@Service
public interface OrderService {
    Order findById(Integer id);

    List<Order> findAll();

    void create(Order order);

    void update(Integer id,Order order);

    void delete(Integer id);
}
