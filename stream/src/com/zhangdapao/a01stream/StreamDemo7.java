package com.zhangdapao.a01stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo7 {
    public static void main(String[] args) {
        //map 数据类型的转换
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张大炮-13","玛琪玛-12");
        list.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                //返回转换类型后的s
               String []arr = s.split("-");//转化为数组,-前一个元素,-后一个元素
                int age = Integer.parseInt(arr[1]);
                return age;
            }
        }).forEach(s-> System.out.println(s));//目前s就是int类型

        //简化
        list.stream()
                .map(s-> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
     }
}
