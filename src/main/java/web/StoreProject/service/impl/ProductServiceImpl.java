package web.StoreProject.service.impl;

import org.springframework.stereotype.Service;
import web.StoreProject.entity.Product;
import web.StoreProject.repository.ProductRepository;
import web.StoreProject.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(Integer id) {
        Product product = null;
        try {
            product = productRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return product;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Integer id, Product product) {
        Product oldProduct = findById(id);
        oldProduct.setName(product.getName());
        oldProduct.setCategory(product.getCategory());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setImage(product.getImage());
        oldProduct.setPrice(product.getPrice());
        productRepository.save(oldProduct);
    }

    @Override
    public void delete(Integer id) {
        Product product = findById(id);
        if (product != null) {
            productRepository.delete(product);
        }
    }
}
