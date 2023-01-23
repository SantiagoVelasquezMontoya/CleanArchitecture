package com.example.STRUCTURE.domain.model.product.dto;

import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.infraestructure.adapters.jpa.entity.ProductDBO;

public class ProductDTO {

    private Integer id;

    private String name;

    private Integer price;

    public ProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductDTO(Product product){
        this.id = product.getId().getValue();
        this.name = product.getName().getValue();
        this.price = product.getPrice().getValue();
    }
    public ProductDTO(ProductDBO productDBO){
        this.id = productDBO.getId();
        this.name = productDBO.getName();
        this.price = productDBO.getPrice();
    }

}
