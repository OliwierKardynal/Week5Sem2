package ie.atu.week5s2.service;

import ie.atu.week5s2.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long nextId = 1;

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
    public List<Product> getAllProducts() {
        return products;
    }
}















