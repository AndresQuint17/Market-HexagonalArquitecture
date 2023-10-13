package com.platzi.market.purchase.infrastructure.controller;

import com.platzi.market.purchase.application.create.CreatePurchaseService;
import com.platzi.market.purchase.application.find.FindPurchaseService;
import com.platzi.market.purchase.domain.dto.PurchaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private CreatePurchaseService createPurchaseService;

    @Autowired
    private FindPurchaseService findPurchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDto>> getAll(){
        return new ResponseEntity<>(findPurchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<List<PurchaseDto>> getByClient(@PathVariable("id") String clientId){
        return findPurchaseService.getByClient(clientId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<PurchaseDto> save(@RequestBody PurchaseDto purchase){
        return new ResponseEntity<>(createPurchaseService.save(purchase), HttpStatus.CREATED);
    }
}
