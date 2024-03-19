package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    //迭代器遍历

    public static void main(String[] args) {

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
            //对于奇数个遍历,如果使用两次it.next()最后会出现报错,指针指的是空的
            //System.out.println(it.next());
            //System.out.println(it.next());
            //迭代器进行遍历时不可以用集合的方法进行删除增加
            //如果删除需用迭代器的删除方法,增加方法未知
            //coll.remove("蕾塞");
            String str = it.next();//获取元素并移动指针.
            if("蕾塞".equals(str)) {
                //
                it.remove();//获取元素并移动指针,那这个删除的还是蕾塞吗??????
            }
        }
        System.out.println(coll);

    }
}
