package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("张大炮",21);
        Student s2 = new Student("张大",2);
        Student s3 = new Student("张炮",1);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        System.out.println(coll);

        Student s4 = new Student("张炮",1);
        //在没有重写equals方法时,使用的是Object类中的equals方法,是根据地址值判断
        System.out.println(coll.contains(s4));
    }
}
