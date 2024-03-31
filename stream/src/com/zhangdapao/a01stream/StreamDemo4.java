package com.zhangdapao.a01stream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //一堆零散的数据
       //public static<T> Stream<T> of(T...values) SStream接口中的静态方法

        Stream.of(1,1,2,3,4).forEach(s-> System.out.println(s));

        //Stream接口的小细节,
        //因为方法的形参是一个可变参数,既可以传递数组,也可以传递零散的元素
        //但是数组必须是引用数据类型,如果传递基本数据类型,时会把整个数组当作一个元素,放到Stream当中
        //从而只输出地址
    }
}
