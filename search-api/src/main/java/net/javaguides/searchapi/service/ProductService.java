package net.javaguides.searchapi.service;

import net.javaguides.searchapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
