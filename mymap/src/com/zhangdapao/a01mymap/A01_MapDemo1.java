package com.zhangdapao.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args){
        //创建map对象,因为map是接口,需要用实现类来创建
        Map<String,String> m = new HashMap<>();

        //添加元素
        m.put("玛琪玛","张大炮");
        m.put("玛","大炮");
        m.put("玛玛","张炮");
        m.put("玛琪","张大");
        //注意他的返回值,添加数据时,如果键是存在的,那么新添加的值就会覆盖掉原有的值,返回值
        //就是被覆盖的值,如果键不存在,返回null

        //删除,返回值是删除键值对的值
        String s = m.remove("玛琪");
        System.out.println(s);

        //清空
//        m.clear();
        //判断键是否存在,判断值是否存在返回值是布尔类型
        m.containsKey("玛琪玛");
        System.out.println(m.containsValue("张大炮"));

        //m.isEmpty(),判断是否为空,
        //m.size()判断键值对个数

    }
}
