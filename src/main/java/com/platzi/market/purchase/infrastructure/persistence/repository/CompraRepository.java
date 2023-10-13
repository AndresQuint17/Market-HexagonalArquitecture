package com.platzi.market.purchase.infrastructure.persistence.repository;

import com.platzi.market.purchase.domain.dto.PurchaseDto;
import com.platzi.market.purchase.domain.repository.PurchaseRepository;
import com.platzi.market.purchase.infrastructure.persistence.crud.CompraCrudRepository;
import com.platzi.market.purchase.infrastructure.persistence.mapper.PurchaseMapper;
import com.platzi.market.shared.infrastructure.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<PurchaseDto> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDto>> getByClient(String clientId) {

        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public PurchaseDto save(PurchaseDto purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
