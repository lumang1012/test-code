package com.zhangdapao.generics_test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        //父类的有参构造不可继承,因为类名不一样(因为类名与构造方法名相同),需要使用super
        LihuaCat li = new LihuaCat("sshh",3);
        Animal a = new Animal() {
            @Override
            public void eat() {

            }
        };





    }
    //该方法可以养所有品种的猫,但是狗不行
    public static void keepCat(ArrayList<? extends Cat> list){

    }

    //该方法可以养所有的狗,但是猫不行
    public static void keepDog(ArrayList<? extends Dog> list){}

    //可以养所有的动物
    public static void keep(ArrayList<? extends Animal> list){}


}
