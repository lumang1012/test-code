package com.zhangda.demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_demo2 {
    public static void main(String[] args){
    student2 s1 = new student2("玛琪玛",21);
    student2 s2 = new student2("光熙",11);
        ArrayList<student2> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        System.out.println(list);

        System.out.println("请输入学生姓名");
        Scanner sc = new Scanner(System.in);
        student2 s3 = new student2();
        s3.setName(sc.next());
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s3.setAge(age);
        System.out.println(s3.getAge());
    }
}
