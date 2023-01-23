package com.example.STRUCTURE.domain.model.product;

import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;
import com.example.STRUCTURE.infraestructure.adapters.jpa.entity.ProductDBO;

public class Product {

    private final ProductId id;

    private final ProductName name;

    private final ProductPrice price;

    public Product(ProductId id, ProductName name, ProductPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(ProductDTO productDTO){
        this.id = new ProductId(productDTO.getId());
        this.name = new ProductName(productDTO.getName());
        this.price = new ProductPrice(productDTO.getPrice());
    }

    public Product(ProductDBO productDBO){
        this.id = new ProductId(productDBO.getId());
        this.name = new ProductName(productDBO.getName());
        this.price = new ProductPrice(productDBO.getPrice());
    }





    public ProductId getId() {
        return id;
    }

    public ProductName getName() {
        return name;
    }

    public ProductPrice getPrice() {
        return price;
    }

}
