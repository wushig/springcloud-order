package com.alice.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderProductService {
    int reduceProduct(Integer productId);
}
