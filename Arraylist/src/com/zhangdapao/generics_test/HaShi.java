package com.zhangdapao.generics_test;

public class HaShi extends Dog{

    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"的泰迪正在打桩");
    }
}
