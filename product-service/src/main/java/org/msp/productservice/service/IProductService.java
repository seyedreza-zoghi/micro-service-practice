package org.msp.productservice.service;

import org.msp.productservice.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product productDetails);
    void deleteProduct(Long id);
}
