package com.zhangdapao.generics_test;

public abstract class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  Animal(){}

    public  Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public abstract void eat();//注意抽象方法不用加方法体只用加个分号就行了
}
