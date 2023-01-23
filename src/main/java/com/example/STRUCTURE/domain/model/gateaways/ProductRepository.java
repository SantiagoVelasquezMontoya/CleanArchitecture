package com.example.STRUCTURE.domain.model.gateaways;


import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;

public interface ProductRepository {

    public Product saveProduct(ProductDTO productDTO);
}
