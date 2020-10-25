package web.StoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.StoreProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
