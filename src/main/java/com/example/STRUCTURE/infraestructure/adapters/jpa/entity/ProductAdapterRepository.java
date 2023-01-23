package com.example.STRUCTURE.infraestructure.adapters.jpa.entity;

import org.springframework.data.repository.CrudRepository;

public interface ProductAdapterRepository extends CrudRepository<ProductDBO, Integer> {
}
