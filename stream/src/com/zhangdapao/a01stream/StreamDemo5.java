package com.zhangdapao.a01stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo5 {
    public static void main(String[] args) {
        //filter过滤

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aa","b","c");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回true 保留这个数,返回false ,去除这个数
                //巧妙利用返回值的布尔值
                return s.startsWith("a");
            }
        }).forEach(s-> System.out.println(s));

       //对于每一个Stream流只会使用一次,尽量用链式编程

        //limit  获取前几个元素
        //skip  跳过前几个元素
        list.stream().limit(2).forEach(s -> System.out.println(s));
        list.stream().skip(2).forEach(s -> System.out.println(s));
        list.stream().limit(2).skip(1).forEach(s -> System.out.println(s));
    }

}
