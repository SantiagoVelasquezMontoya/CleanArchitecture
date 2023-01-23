package com.example.STRUCTURE.domain.usecase.product;

import com.example.STRUCTURE.domain.model.gateaways.ProductRepository;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;
import com.example.STRUCTURE.infraestructure.adapters.jpa.entity.ProductDBO;

public class ProductUseCase {
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDBO saveProduct(ProductDTO productDTO){
        ProductDBO productDBO = new ProductDBO(productRepository.saveProduct(productDTO));
        return productDBO;
    }
}
