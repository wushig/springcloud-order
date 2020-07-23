package com.alice.service.impl;

import com.alice.dao.ProductMapper;
import com.alice.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProductServiceImpl implements OrderProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public int reduceProduct(Integer productId) {
        return productMapper.reduceProduct(productId);
    }
}
