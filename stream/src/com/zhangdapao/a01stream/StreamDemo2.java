package com.zhangdapao.a01stream;

import java.util.HashMap;

public class StreamDemo2 {
    public static void main(String[] args) {
        //双列集合  无法直接使用stream,你需要将它们转换为单列集合

        //创建双列集合
        HashMap<String,Integer> map = new HashMap<>();
        map.put("玛琪玛",2);
        map.put("玛琪",2);
        map.put("玛玛",4);

        //获取stream流//先转变为单列集合//为啥没有由值组键的集合,set会去重
        map.keySet().forEach(s-> System.out.println(s));
        map.entrySet().forEach(s-> System.out.println(s));

    }
}
