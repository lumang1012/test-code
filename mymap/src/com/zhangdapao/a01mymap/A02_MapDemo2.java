package com.zhangdapao.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map的遍历方式,键找值
        //创建Map集合
        Map<String,String> m = new HashMap<>();
        m.put("玛琪玛","张大炮");
        m.put("玛","大炮");
        m.put("玛玛","张炮");

        //获取所有的键,并将这些键放到一个单列集合中
        Set<String> keys = m.keySet();
        //进行遍历获取每一个键(三种遍历方式均可)
         for(String key : keys){
            // System.out.println(key);
             //通过键获取对应的值
             String value = m.get(key);
             System.out.println(key+"="+value);
         }

         //迭代器遍历
        Iterator<String> it = keys.iterator();
         while(it.hasNext()){
             System.out.println(m.get(it.next()));
         }

         //Lambda表达式
        keys.forEach( s -> System.out.println(m.get(s)));
    }
}
