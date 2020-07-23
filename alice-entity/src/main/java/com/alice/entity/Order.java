package com.alice.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {
    private Integer id;

    private String orderNo;

    private Integer userId;

    private Integer productId;

    private BigDecimal price;

    private Date createTime;

    private String status;


}