package com.zhangdapao.a07Collections;

import java.util.ArrayList;
import java.util.Collections;

public class A01CollectionDemo1 {
    public static void main(String[] args) {

        //public static <T> boolean addAll(Collection<T> c, T...element)批量添加元素
        //public static void shuffle(List<?> list)  打乱list中的顺序


        ArrayList<String> list = new ArrayList<>();
        //工具类,直接用类名调用方法
        Collections.addAll(list, "s","s","aa");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
