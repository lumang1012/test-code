package com.zhangda.demo1;
import java.util.Scanner;

public class test2 {
    public static void swap(int[] list,int k,int i){
        int temp = list[k];
        list[k] = list[i];
        list[i] = temp;
    }
    public static void perm(int [] list, int k, int m){
        if(k == m){
            for(int i=0;i<=m;i++)
                System.out.print(list[i]);

                System.out.println();
                //TODO


        }
        else
            for(int i=k;i<=m;i++){
                swap(list,k,i);
                perm(list,k+1,m);
                swap(list,k,i);
            }
    };


    public static void main(String[] args){
        System.out.println("请输入要进行排列元素的个数: ");
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        int [] list = new int[length1];
        System.out.println("请输入进行排列的元素.");
        for(int i=0;i<length1;i++){
            list[i] = sc.nextInt();
        }

        System.out.println("全排列的所有可能.");
        perm(list, 0, length1-1);
        //重复如何解决
    };
}
