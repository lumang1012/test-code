package com.zhangdapao.a01stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo8 {
    public static void main(String[] args) {
        //终结方法
        //void forEach(Consumer action)  遍历
        //long count() 统计
        //toArray()  收集流中的数据到数组中

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "sss","s","ab");

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //化简
        list.stream().forEach(s->System.out.println(s));

        long count = list.stream().count();//返回值是long类型的整数
        System.out.println(count);

       Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));
       for(Object s : array){
           System.out.println(s);
       }
        //泛型是要转换的类型,value指的是数组长度
        String[] strings = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
       //lambda表达式
        String[] strings2 = list.stream().toArray( value->new String[value]);
        //toArray转变为两种类型一个是转变为object类型的数组
        //另一个是指定类型的数组

    }
}
