package org.msp.productservice.service;

import lombok.RequiredArgsConstructor;
import org.msp.productservice.model.Product;
import org.msp.productservice.repository.IProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final IProductRepo iProductRepo;

    @Override
    public List<Product> getProducts() {
        return iProductRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return iProductRepo.findById(id)
                .orElse(null); // Returns null if no product found with the given ID
    }

    @Override
    public Product createProduct(Product product) {
        return iProductRepo.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product productDetails) {
        Optional<Product> optionalProduct = iProductRepo.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            return iProductRepo.save(product);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        iProductRepo.deleteById(id);
    }
}
