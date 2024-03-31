package com.zhangdapao.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo5 {
    public static void main(String[] args) {

        //核心 如果HashMap的键是自定义对象,则需要重写hashcode和equals方法
        HashMap<Student,String> hashMap = new HashMap<>();
        Student s1 = new Student("张大炮",12);
        Student s2 = new Student("张大",12);
        hashMap.put(s1,"南阳");
        hashMap.put(s2, "阳");

        //通过整个键值对进行遍历
        Set<Map.Entry<Student, String>> Entries = hashMap.entrySet();

        for(Map.Entry<Student,String> entry : Entries){
            System.out.println("名字是"+entry.getKey().getName()+",年龄是"+entry.getKey().getAge()+",籍贯是"+entry.getValue());

        }

        //通过键进行遍历
        Set<Student> students = hashMap.keySet();
        for(Student stu : students){
            System.out.println("名字是"+stu.getName()+",年龄是"+stu.getAge()+",籍贯是"+hashMap.get(stu));
        }

        //Lambda表达式
        hashMap.forEach(( student, s) -> System.out.println("名字是"+student.getName()+",年龄是"+student.getAge()+",籍贯是"+hashMap.get(student)));
    }
}
