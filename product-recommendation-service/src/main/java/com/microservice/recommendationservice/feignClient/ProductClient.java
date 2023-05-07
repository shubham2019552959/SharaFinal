package com.microservice.recommendationservice.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.recommendationservice.model.Product;

@FeignClient (name = "product-catalog-service", url = "http://localhost:8810/")
public interface ProductClient {

    @GetMapping (value = "/products/{id}")
    public Product getProductById(@PathVariable(value = "id") Long productId);
}
