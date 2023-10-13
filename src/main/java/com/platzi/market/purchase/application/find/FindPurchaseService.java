package com.platzi.market.purchase.application.find;

import com.platzi.market.purchase.domain.dto.PurchaseDto;
import com.platzi.market.purchase.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FindPurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<PurchaseDto> getAll(){
        return purchaseRepository.getAll();
    }

    public Optional<List<PurchaseDto>> getByClient(String clientId){
        return purchaseRepository.getByClient(clientId);
    }
}
