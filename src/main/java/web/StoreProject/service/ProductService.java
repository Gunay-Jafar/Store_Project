package web.StoreProject.service;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Product;

import java.util.List;

@Service
public interface ProductService {
    Product findById(Integer id);

    List<Product> findAll();

    void create(Product product);

    void update(Integer id,Product product);

    void delete(Integer id);
}
