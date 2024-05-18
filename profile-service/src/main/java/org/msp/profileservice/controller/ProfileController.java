package org.msp.profileservice.controller;

import lombok.RequiredArgsConstructor;
import org.msp.profileservice.external.ProductClient;
import org.msp.profileservice.external.modelResponse.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final ProductClient productClient;
    @GetMapping("/profiles")
    public List<ProductResponse> profiles() {
        List<ProductResponse> products = productClient.getProducts();
        return products;
    }
}
