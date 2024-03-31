package com.zhangdapao.a01mymap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo7 {
    //存取有序,LeakedHashMap
    public static void main(String[] args) {
        //注意类型.一定要用包装类,基本数据的对象
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();

        //添加元素
        linkedHashMap.put("玛琪玛",33);
        //不重复,替换值
        linkedHashMap.put("玛琪玛",3);
        linkedHashMap.put("玛琪",33);
        linkedHashMap.put("玛玛",33);
        //输出与输入顺序相同
        System.out.println(linkedHashMap);
    }
}
