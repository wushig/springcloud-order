package com.alice.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class NacosUtil {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("nacos"));
    }

}
