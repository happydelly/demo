package com.ttx.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test2 {

    public static void main(String[] args){
        List<prodcutVo> prod = new ArrayList<>();
        List<prodcutVo> prod2 = new ArrayList<>();
        prodcutVo p1 = new prodcutVo("1","红色");
        prodcutVo p2 = new prodcutVo("2","黄色");
        prodcutVo p3 = new prodcutVo("3","红色");
        prod.add(p1);
        prod.add(p2);
        prod.add(p3);

        prod2 = prod.stream().filter((p) -> p.getColor().equals("红色")).map(p -> new prodcutVo(p.getId(),p.getColor()))
                .collect(Collectors.toList());

        List<String> strings = prod.stream().map(prodcutVo::getColor)
                .collect(Collectors.toList());
        System.out.println(prod2);
        System.out.println(strings);
    }
}
