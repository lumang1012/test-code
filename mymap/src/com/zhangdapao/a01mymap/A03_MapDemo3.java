package com.zhangdapao.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //第二种遍历方式

        Map<String,String> m = new HashMap<>();
        m.put("玛琪玛","张大炮");
        m.put("玛","大炮");
        m.put("玛玛","张炮");

        //利用方法将所有的entry对象放到set集合中
        //Entry是Map的内部接口
        Set< Map.Entry<String,String>> entries = m.entrySet();

        //增强for遍历
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //迭代器遍历
        Iterator<Map.Entry<String,String>> it = new Iterator<Map.Entry<String, String>>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Map.Entry<String, String> next() {
                return null;
            }
        };
        while(it.hasNext()){
            System.out.println(it.next().getValue());
            System.out.println(it.next().getKey());
        }

        //Lambda表达式
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey());
                System.out.println(stringStringEntry.getValue());
            }
        });
    }
}
