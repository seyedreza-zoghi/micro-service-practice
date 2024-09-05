package org.msp.profileservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.msp.profileservice.external.ProductClient;
import org.msp.profileservice.external.modelResponse.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Profile")
public class ProfileController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/profiles")
    @CircuitBreaker(name = "profilesService",fallbackMethod = "errorProfileService")
    public List<ProductResponse> profiles() {
        List<ProductResponse> products = productClient.getProducts();
        return products;
    }

    public List<ProductResponse> errorProfileService(Throwable t) {
        return List.of(new ProductResponse(),new ProductResponse());
//        throw new RuntimeException("خطا در فراخوانی سرویس محصولات", t);
    }
}
