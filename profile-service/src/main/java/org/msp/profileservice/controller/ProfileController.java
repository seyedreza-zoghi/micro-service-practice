package org.msp.profileservice.controller;

import org.msp.profileservice.external.ProductClient;
import org.msp.profileservice.external.modelResponse.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/profiles")
    public List<ProductResponse> profiles() {
        List<ProductResponse> products = productClient.getProducts();
        return products;
    }
}
