package com.example.STRUCTURE.infraestructure.adapters.jpa.entity;


import com.example.STRUCTURE.domain.model.product.Product;
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

}
