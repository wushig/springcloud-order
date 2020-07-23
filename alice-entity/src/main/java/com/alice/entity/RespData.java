package com.alice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespData<T> implements Serializable {
    private String code;
    private String message;
    private T t;

}
