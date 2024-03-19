package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    //集合进阶-增强for

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("玛琪玛");
        coll.add("光熙");
        coll.add("蕾塞");
        for(String s : coll){
            System.out.println(s);
        }
        coll.add("张大炮");
        //快速生成方式coll.for
        //注意修改s这个第三方变量不会影响数组
        for (String s : coll) {
            System.out.println(s);
        }

    }
}
