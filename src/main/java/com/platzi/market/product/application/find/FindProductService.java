package com.platzi.market.product.application.find;

import com.platzi.market.product.domain.dto.ProductDto;
import com.platzi.market.product.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FindProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAll(){
        return productRepository.getAll();
    }

    public Optional<ProductDto> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<ProductDto>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }
}
