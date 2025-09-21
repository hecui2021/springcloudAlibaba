package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 22:56
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        Map<String,String> map = new LinkedHashMap<>();
        Set<String> strings = map.keySet();
        List<Integer> list = new ArrayList<>();
        int a = 1;
        int i = Math.min(a, 0);
    }
}
