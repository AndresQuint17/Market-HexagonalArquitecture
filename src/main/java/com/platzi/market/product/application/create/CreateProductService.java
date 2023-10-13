package com.platzi.market.product.application.create;

import com.platzi.market.product.domain.dto.ProductDto;
import com.platzi.market.product.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDto save(ProductDto product) {
        return productRepository.save(product);
    }
}
