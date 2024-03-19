package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A05_CollectionDemo6 {
    public static void main(String[] args) {
        //lambda表达式遍历
        //default void forEach(Consumer<? super T>action)

        Collection<String> coll = new ArrayList<>();
        coll.add("玛琪玛");
        coll.add("光熙");
        coll.add("蕾塞");
        //2.利用匿名内部类的形式
        coll.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda表达式
        //简化代码
        //变量类型可以省略,当变量只有一个时,括号可以省略
        //coll.forEach(s->System.out.println(s));
    }
}
