package com.platzi.market.category.application.find;

import com.platzi.market.category.domain.dto.CategoryDto;
import com.platzi.market.category.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDto> getAll(){
        return categoryRepository.getAll();
    }
}
