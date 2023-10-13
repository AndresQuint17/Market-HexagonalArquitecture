package com.platzi.market.category.domain.repository;

import com.platzi.market.category.domain.dto.CategoryDto;

import java.util.List;

public interface CategoryRepository {

    List<CategoryDto> getAll();
}
