package com.platzi.market.category.infrastructure.controller;

import com.platzi.market.category.application.find.FindCategoryService;
import com.platzi.market.category.domain.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private FindCategoryService findCategoryService;

    @GetMapping("/all")
    public List<CategoryDto> getAll(){
        return findCategoryService.getAll();
    }
}
