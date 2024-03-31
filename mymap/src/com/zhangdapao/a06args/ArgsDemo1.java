package com.zhangdapao.a06args;

public class ArgsDemo1 {
    //args ==Arguments
    //可变参数
    public static void main(String[] args) {
        //格式:属性类型...名字
        //int...arr
        System.out.println(getSum(1,1,1,3)
        );
    }

    public static int getSum(int...args){
        int sum = 0;
        for(int i : args){
            sum = sum + i;
        }
        return sum;
    }
}
