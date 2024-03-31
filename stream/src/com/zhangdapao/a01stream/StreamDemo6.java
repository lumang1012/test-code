package com.zhangdapao.a01stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        //distinct  元素去重,依赖(hashcode和eqals方法)//对于自定义对象,需要重写
        //concat 合并a,b 两个流为一个流,尽可能保持a与b的数据类型,不然合并流是二者的父类型,无法调用
        //子类的方法

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list,"a","b","c","a");
        Collections.addAll(list2,"d");

        list.stream().distinct().forEach(s -> System.out.println(s));
        //底层是使用hashset进行去重,而hashset则是依靠hashcode和eqals方法

        //注意合并的是两个流,要提前将数据转化为流
        Stream.concat(list.stream(),list2.stream()).forEach(s-> System.out.println(s));

    }
}
