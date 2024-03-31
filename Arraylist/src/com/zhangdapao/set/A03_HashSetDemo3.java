package com.zhangdapao.set;

import java.util.HashSet;

public class A03_HashSetDemo3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("玛琪玛",21);
        Student2 s2 = new Student2("玛",2);
        Student2 s3 = new Student2("玛玛",1);
        Student2 s4 = new Student2("玛琪玛",21);

        //创建集合去重
        //如何对于这个自定义对象没有进行hashcode和equals方法重写,则无法去重
        //对于string和Integer,自身早已重写
        HashSet<Student2> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //打印集合
        System.out.println(hs);

    }
}
