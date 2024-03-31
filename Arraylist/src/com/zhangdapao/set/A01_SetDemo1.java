package com.zhangdapao.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        //1 创建一个set对象,因为set是一个接口,所以需要使用他的实现类对象
        Set<String> s = new HashSet<>();

        //2 添加元素,因为set是不重复的(元素是唯一的),所以add的返回值是有用的,
        // 返回是false时,说明set中已经有了当前元素.
        s.add("玛琪玛");
        s.add("蕾塞");
        s.add("秋");

        System.out.println(s);
        //特点 1 无序,2 无索引, 3 不重复

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //增强for
        for(String str : s){
            System.out.println(str);
        }

        //Lambda表达式
       s.forEach(str2 -> System.out.println(s));


    }


}
