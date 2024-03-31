package com.zhangdapao.set;

public class A02_HashSetDemo2 {
    public static void main(String[] args) {
        //HashSet讲解

        //1 创建对象

        com.zhangdapao.set.Student s1 = new com.zhangdapao.set.Student("张大炮",21);
        com.zhangdapao.set.Student s2 = new Student("张大炮",21);

        //如果没有重写hashcode方法,对于属性值相同的对象也是不同的,因为他是根据地址计算哈希值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        //在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希值相同
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

    }



}
