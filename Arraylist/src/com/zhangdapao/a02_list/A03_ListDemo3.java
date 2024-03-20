package com.zhangdapao.a02_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        //List系列的五种遍历方法
        //List是一个接口,所以用其实现类创建对象
        List<String> list = new ArrayList<>();

        list.add("玛琪玛");
        list.add("玛琪");
        list.add("玛");

        //迭代器
       Iterator<String> it = list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());}

       //增强for,快捷键list.for,注意s是第三方变量
           for(String s : list){
               System.out.println(s);
           }

       //Lambda表达式
       //forEach方法底层其实是一个循环遍历,依次得到每一个元素
       //并把每一个元素传递给下面的accept方法
       //accept方法的形参s,依次表示集合的每一个元素
       //forEach中的参数是接口类型(函数式接口),需要使用匿名内部类的对象
//           list.forEach(new Consumer<String>() {
//               @Override
//               public void accept(String s) {
//                   System.out.println(s);
//               }
//           });
        //简化
           list.forEach(s->System.out.println(s));

        //普通for循环
        //size方法与get方法结合,利用索引实现循环
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            System.out.println(str2);
        }

        //列表迭代器
        //与之前的迭代器几乎相同,只是多了一个add()方法
        //在遍历时不可以用list本身的add方法会报错,只能用迭代器本身的add
        ListIterator<String> it1 = list.listIterator();
        while(it1.hasNext()){
            String str2 = it1.next();
            if(str2.equals("玛琪玛"))
                it1.add("张大炮");
         }
        System.out.println(list);
    }
}
