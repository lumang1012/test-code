package com.zhangdapao.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        //Lambda 表达式

        Map<String,String> m = new HashMap<>();
        m.put("玛琪玛","张大炮");
        m.put("玛","大炮");
        m.put("玛玛","张炮");

        //底层源码是利用了第二种方式遍历,一次得到每一个键值对
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

            }
        });
        //参数两个小括号不可省略
        m.forEach(( key, value)->System.out.println(key+"="+value));
    }
}
