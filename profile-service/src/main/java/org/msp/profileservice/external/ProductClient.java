package org.msp.profileservice.external;

import org.msp.profileservice.external.modelResponse.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product-service",url = "http://localhost:8081")
public interface ProductClient {
    @GetMapping("/Products")
    List<ProductResponse> getProducts();
}
