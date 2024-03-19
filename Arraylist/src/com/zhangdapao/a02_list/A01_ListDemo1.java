package com.zhangdapao.a02_list;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    //List系列集合独有方法

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");

        //在1索引位置添加玛琪玛
//        将该元素添加到当前索引,其他的元素向后排
        list.add(1,"玛琪玛");


        //删除方法
        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }
}
