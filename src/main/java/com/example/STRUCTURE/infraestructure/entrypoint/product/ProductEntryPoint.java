package com.example.STRUCTURE.infraestructure.entrypoint.product;


import com.example.STRUCTURE.domain.model.product.Product;
import com.example.STRUCTURE.domain.model.product.dto.ProductDTO;
import com.example.STRUCTURE.domain.usecase.product.ProductUseCase;
import com.example.STRUCTURE.infraestructure.adapters.jpa.entity.ProductDBO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductEntryPoint {

    private final ProductUseCase productUseCase;
    @PostMapping
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return new ProductDTO(productUseCase.saveProduct(productDTO));
    }


}
