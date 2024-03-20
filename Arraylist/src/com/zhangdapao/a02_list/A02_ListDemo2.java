package com.zhangdapao.a02_list;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        //删除的小细节

        //list删除有两个,一个是根据索引删除
//        另一个是根据对象删除
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);

        //删除的是索引为一的元素,那么为何不删除值为一的,因为在调用方法
        //时,发生方法重载,优先调用实参与形参类型一致的
        //此时的1是int类型的与index一样
        list.remove(1);

        //如何调用删除对象的方法
        //手动装箱
        Integer i = Integer.valueOf(1);
        //本质还是方法重载优先级
        list.remove(i);


    }
}
