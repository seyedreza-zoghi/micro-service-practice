package org.msp.productservice.service;

import lombok.RequiredArgsConstructor;
import org.msp.productservice.model.Product;
import org.msp.productservice.repository.IProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final IProductRepo iProductRepo;
    @Override
    public List<Product> getProducts() {
        return iProductRepo.findAll();
    }
}
