package com.platzi.market.product.application.update;

import com.platzi.market.product.application.find.FindProductService;
import com.platzi.market.product.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FindProductService findProductService;

    public boolean delete(int productId){
        return findProductService.getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }
}
