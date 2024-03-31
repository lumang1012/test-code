package com.zhangdapao.set;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("玛琪玛",21);
        Student2 s2 = new Student2("玛",2);
        Student2 s3 = new Student2("玛玛",1);
        Student2 s4 = new Student2("玛琪玛",21);

        //创建集合
        LinkedHashSet<Student2> s = new LinkedHashSet<>();
        //
        //添加元素
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        //输出
        System.out.println(s);
    }
}
