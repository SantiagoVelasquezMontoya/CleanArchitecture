package com.example.STRUCTURE.application.configuration;


import com.example.STRUCTURE.domain.model.gateaways.ProductRepository;
import com.example.STRUCTURE.domain.usecase.product.ProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class UseCaseBeanConfig {


    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository){
        return new ProductUseCase(productRepository);
    }
}
