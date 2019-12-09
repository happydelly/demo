package com.ttx.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test2 {

    public static void main(String[] args){
        List<prodcutVo> prod = new ArrayList<>();
        List<prodcutVo> prod2 = new ArrayList<>();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

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
        Integer count = list.stream().reduce(0,(x,y)->x+y);

        System.out.println(count);
        System.out.println(prod2);
        System.out.println(strings);
    }
}
