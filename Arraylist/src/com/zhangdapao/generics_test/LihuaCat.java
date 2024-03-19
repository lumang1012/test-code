package com.zhangdapao.generics_test;

public class LihuaCat extends Cat{
    public LihuaCat(){}
    public LihuaCat(String name,int age){
        super();
    }


    @Override
    public void eat(){
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的波斯猫,正在吃小鱼干");
    }


}
