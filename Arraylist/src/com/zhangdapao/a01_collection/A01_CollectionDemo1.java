package com.zhangdapao.a01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args){

        //注意collection是一个接口,不可以直接创建对象,所以创建对象时,是创建其实现类的对象
        Collection<String> coll = new ArrayList<>();

        //1.添加元素,返回值是布尔值,而且永远是true,因为list允许存在重复元素,
        //但是如果是set系列集合,不允许有重复值,如果添加的已经存在,则返回false
        coll.add("玛琪玛");
        coll.add("光熙");
        coll.add("蕾塞");

        System.out.println(coll);

        //2.清空
       // coll.clear();

        //3.删除
        //使用remove时不可以使用索引,是根据对象删除的,返回值是布尔类型
        //collection里面是共性问题,共性就是List与set都使用这个方法,
        // 但是set系列集合没有索引进行删除,所以方法为了兼容不使用索引删除
        coll.remove("蕾塞");
        System.out.println(coll);

        //4.判断元素是否包含
        //细节:判断包含的底层代码使用equals方法,所以对于自定义对象,需要重写equals,因为这些对象
        //比较的是地址,所以一定要在javabean中重写equals方法
        boolean result = coll.contains("玛琪玛");
        System.out.println(result);

        //5.判断是否为空
        boolean result1 = coll.isEmpty();
        System.out.println(result1);

        //6.判断长度
        System.out.println(coll.size());
    }
}
