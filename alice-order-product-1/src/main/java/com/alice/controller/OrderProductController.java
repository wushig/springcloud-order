package com.alice.controller;

import com.alice.service.OrderProductService;
import com.alice.entity.RespData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderProductController {
    @Autowired
    private OrderProductService orderProductService;


    @PostMapping("/reduceProduct")
    public RespData reduceProduct(@RequestBody Integer productId){
        log.info("我是82哦");
        orderProductService.reduceProduct(productId);
        return new RespData("200","操作成功",null);
    }
}
