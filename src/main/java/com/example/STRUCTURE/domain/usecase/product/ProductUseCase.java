package com.example.STRUCTURE.domain.usecase.product;

import com.example.STRUCTURE.domain.model.gateaways.ProductRepository;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;

public class ProductUseCase {
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDTO saveProduct(ProductDTO productDTO){
        return productRepository.saveProduct(productDTO);
    }
}
