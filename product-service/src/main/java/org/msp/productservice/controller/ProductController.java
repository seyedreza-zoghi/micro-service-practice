package org.msp.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.msp.productservice.model.Product;
import org.msp.productservice.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService iProductService;

    @GetMapping
    public List<Product> products() {
        return iProductService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return iProductService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return iProductService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return iProductService.updateProduct(id, productDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        iProductService.deleteProduct(id);
    }
}
