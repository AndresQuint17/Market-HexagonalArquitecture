package com.platzi.market.category.infrastructure.persistence.crud;

import com.platzi.market.shared.infrastructure.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {

}
