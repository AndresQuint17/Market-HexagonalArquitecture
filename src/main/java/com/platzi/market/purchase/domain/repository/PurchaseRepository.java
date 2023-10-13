package com.platzi.market.purchase.domain.repository;

import com.platzi.market.purchase.domain.dto.PurchaseDto;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<PurchaseDto> getAll();

    Optional<List<PurchaseDto>> getByClient(String clientId);

    PurchaseDto save(PurchaseDto purchase);
}
