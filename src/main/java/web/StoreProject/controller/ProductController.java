package web.StoreProject.controller;

import org.springframework.web.bind.annotation.*;
import web.StoreProject.entity.Product;
import web.StoreProject.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @PostMapping("/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Product product){
        productService.update(id,product);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        productService.delete(id);
    }
}
