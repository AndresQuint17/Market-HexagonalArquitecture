package com.platzi.market.purchase.application.create;

import com.platzi.market.purchase.domain.dto.PurchaseDto;
import com.platzi.market.purchase.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public PurchaseDto save(PurchaseDto purchase){
        return purchaseRepository.save(purchase);
    }
}
