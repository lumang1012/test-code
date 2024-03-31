package com.zhangdapao.a01mymap;

import java.util.*;

public class A06_HashMapDemo6 {
    public static void main(String[] args){
        //定义一个数组
        String[] arr = {"a", "b", "c"};
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);//获取0--length-1的随机数
            list.add(arr[index]);
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String name : list){//遍历list,将统计次数当作值
            if(hashMap.containsKey(name)){
            int count = hashMap.get(name);//获取统计次数
            count++;
            hashMap.put(name,count);//将最新计算的次数覆盖之前的次数
            }
            else{//如果此时还没有一次投票,值设为一
                hashMap.put(name,1);
            }
        }
        //通过对键值对遍历,获得最大的值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            if(max<entry.getValue()){
                max = entry.getValue();
            }
        }
        //通过对键值对遍历,获取最大的值的键
        System.out.println(max);
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue()==max){
                System.out.println(entry.getKey());
            }
        }

    }
}
