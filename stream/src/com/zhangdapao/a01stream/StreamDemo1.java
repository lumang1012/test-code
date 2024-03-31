package com.zhangdapao.a01stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //单列集合  default Stream<E> stream() Collection中的默认方法

        //1 单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        //获取一条流水线,并把集合上的数据放到流水线上
        Stream<String> stream1 = list.stream();

        //使用终结方法打印流水线上的所有数据
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                //s表示依次打印的数据
//                System.out.println(s);
//            }
//        });

        //简化写法
        list.stream().forEach(s -> System.out.println(s));

    }
}
