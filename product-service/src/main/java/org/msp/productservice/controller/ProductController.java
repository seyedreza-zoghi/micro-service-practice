package org.msp.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.msp.productservice.model.Product;
import org.msp.productservice.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
