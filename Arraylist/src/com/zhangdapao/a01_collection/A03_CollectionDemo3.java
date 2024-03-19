package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //迭代器遍历
        //1.创建数组
        Collection<String> coll = new ArrayList<>();

        coll.add("玛琪玛");
        coll.add("光熙");
        coll.add("蕾塞");

        //利用Iterator方法创建迭代器对象
        //注意返回值对象
        //不依赖索引
        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
