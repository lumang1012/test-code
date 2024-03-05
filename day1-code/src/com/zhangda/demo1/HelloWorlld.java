package com.zhangda.demo1;

public abstract class HelloWorlld {
    //目的为了使所有继承这个类的子类重写swim时格式一致
    private int age;

    public HelloWorlld() {
    }

    public HelloWorlld(int age) {
        this.age = age;
    }

    public abstract void swim();


    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
