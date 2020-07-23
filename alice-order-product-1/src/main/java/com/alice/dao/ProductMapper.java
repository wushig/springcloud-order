package com.alice.dao;


import com.alice.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int reduceProduct(@Param("id") Integer productId);
}