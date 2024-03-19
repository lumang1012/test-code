package com.zhangda.demo1;

import java.util.Scanner;

public class test {
    public static int binarySearch(int [] a,int x,int n){
        int left = 0;int right = n-1;
        while(left <= right){
            int mid = (left +right)/2;
            if (x == a[mid]) return mid;
            if (x>a[mid]) left=mid+1;
            else right = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args){
        int [] a = {1, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要搜索的数字:");
        int x =sc.nextInt();

        int index =binarySearch(a, x,a.length);
        if(index != -1){
            System.out.printf("该数字在数组中的索引是"+index);
        }
        else
            System.out.printf("数组中不存在该数字.");

    };
}


