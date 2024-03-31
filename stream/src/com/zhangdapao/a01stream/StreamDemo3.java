package com.zhangdapao.a01stream;

import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {
        //数组   public static <T> Stream<T> stream(T[] array)  Arrays工具类中的静态方法

        int[] arr1 = {1,2,3,4};
        String[] arr2 = {"a"};
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
    }
}
