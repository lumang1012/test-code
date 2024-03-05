package com.zhangda.demo1;

import java.util.ArrayList;

public class Arraylist_demo1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();//忽略了大小写

        list.add("玛琪玛");
        list.add("我想做你");
        list.add("的狗");
        Integer a = 3;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(a);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1)
                System.out.print(list.get(i));
            else
                System.out.print(list.get(i)+",");
        }
        System.out.println("]");
        System.out.println(list2.get(0));
        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('a');
        list3.add('a');
        System.out.println(list3);
    }


}
