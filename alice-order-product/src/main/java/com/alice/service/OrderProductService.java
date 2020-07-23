package com.alice.service;

import com.alice.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public interface OrderProductService {
    int reduceProduct(Integer productId);
}
