package com.example.STRUCTURE.infraestructure.adapters.jpa.entity;

import com.example.STRUCTURE.domain.model.gateaways.ProductRepository;
import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryAdapter implements ProductRepository {


    private final ProductAdapterRepository productAdapterRepository;

    public ProductRepositoryAdapter(ProductAdapterRepository productAdapterRepository) {
        this.productAdapterRepository = productAdapterRepository;
    }

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        ProductDBO productDBO = new ProductDBO();
        return productDBO.toProduct((productAdapterRepository.save(new ProductDBO(productDTO))));
        //return new Product(productDTO);
    }



}
