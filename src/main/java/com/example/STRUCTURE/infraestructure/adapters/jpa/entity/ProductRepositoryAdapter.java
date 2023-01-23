package com.example.STRUCTURE.infraestructure.adapters.jpa.entity;

import com.example.STRUCTURE.domain.model.gateaways.ProductRepository;
import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;

public class ProductRepositoryAdapter implements ProductRepository {

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        return null;
    }



}
