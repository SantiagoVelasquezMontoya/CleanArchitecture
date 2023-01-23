package com.example.STRUCTURE.infraestructure.adapters.jpa.entity;


import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.domain.model.product.ProductId;
import com.example.STRUCTURE.domain.model.product.ProductName;
import com.example.STRUCTURE.domain.model.product.ProductPrice;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "products")
public class ProductDBO {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer price;

    //Mapear a producto Recibe ProductoDTO

    public ProductDBO(ProductDTO productDTO){
        this.id = productDTO.getId();
        this.name= productDTO.getName();
        this.price= productDTO.getPrice();
    }

    public ProductDBO(Product product){
        this.id = product.getId().getValue();
        this.name= product.getName().getValue();
        this.price= product.getPrice().getValue();
    }
    public Product toProduct(ProductDBO productDBO){
        return new Product(
                new ProductId(productDBO.getId()),
                new ProductName(productDBO.getName()),
                new ProductPrice(productDBO.getPrice())
        );
    }


}
