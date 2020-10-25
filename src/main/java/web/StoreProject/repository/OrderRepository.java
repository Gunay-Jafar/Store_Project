package web.StoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.StoreProject.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
