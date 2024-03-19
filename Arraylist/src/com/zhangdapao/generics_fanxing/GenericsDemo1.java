package com.zhangdapao.generics_fanxing;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);




    }

    //为什么该方法不可以定义在main方法中
//    在Java中，方法不能在其他方法内部或方法内部声明main。
//    method因此，方法内部的方法声明main是无效的，会导致编译错误[ 1 ]。
    public static void method(ArrayList<? extends Ye> list){//注意当使用到?是static后不用再加泛型

    }
}
class Ye{}

class Fu extends Ye{}

class Zi extends Fu{}