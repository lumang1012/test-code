package com.zhangdapao.a01stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo9 {
    public static void main(String[] args){
        //collect(Collector collector)收集流中的数据到集合
        //注意集合中的键是不可以重复的,否则会报错duplicatekey

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,  "张大-男-2","张炮-男-23","玛琪玛-女-29","张大炮-男-211");

        List<String> collect = list.stream()
                                    .filter(s -> "男".equals(s.split("-")[1]))
                                    .collect(Collectors.toList());
        //System.out.println(collect);

        Set<String> collect1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        //System.out.println(collect1);

//
        Map<String, Integer> collect2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0]
                , s->Integer.parseInt(s.split("-")[2])));
        System.out.println(collect2.entrySet());
    }
}
