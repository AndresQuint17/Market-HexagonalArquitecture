package com.platzi.market.category.infrastructure.persistence.repository;

import com.platzi.market.category.domain.dto.CategoryDto;
import com.platzi.market.category.domain.repository.CategoryRepository;
import com.platzi.market.category.infrastructure.persistence.crud.CategoriaCrudRepository;
import com.platzi.market.category.infrastructure.persistence.mapper.CategoryMapper;
import com.platzi.market.shared.infrastructure.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @Autowired
    private CategoryMapper mapper;
    @Override
    public List<CategoryDto> getAll() {
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategories(categorias);
    }
}
