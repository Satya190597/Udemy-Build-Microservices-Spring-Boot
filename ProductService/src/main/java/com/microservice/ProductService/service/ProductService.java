package com.microservice.ProductService.service;

import com.microservice.ProductService.model.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
