package com.zhangda.demo1;

import java.util.Scanner;

public class teat3 {
    //矩阵连乘

    public static void main(String[] args) {

    //数组m表示所有情况的最少相乘次数,n表示矩阵的个数
    //数组s存储分割的点位
     Scanner sc = new Scanner(System.in);
     System.out.print("请输入矩阵个数: ");
     int n = sc.nextInt();
    int[][] m = new int[n+1][n+1];
    int[][] s = new int[n+1][n+1];
    //数组p存储矩阵的维数,,注意判断维数是否合法
        int[] p = new int[n+1];
        System.out.println("请输入矩阵维数");
        for (int i = 0; i < p.length; i++) {
           p[i] = sc.nextInt();
        }

     matrixChain(p, m, s);

//        获得最优值m[1][n]
        System.out.println("矩阵相乘的最少次数是"+m[1][n]);
    }

    //矩阵相乘函数

    public static void  matrixChain(int [] p, int[][] m, int[][] s){
        //确定维数
        int n = p.length - 1;

//        初始化i = j时的次数
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }

//        子问题的规模
        for (int r = 2; r <= n; r++) {
//        相同规模下子问题的个数
            for (int i = 1; i <= n - r + 1; i++) {
//               当k=i时m[i][j]和s[i][j]的值
                int j =i+r-1;
                m[i][j] = m[i+1][j]+p[i-1]*p[i]*p[j];
                s[i][j] = i;//当前的分割点
                for (int k = i+1; k < j; k++) {
                    int temp = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(m[i][j]>temp){
                        m[i][j] = temp;
                        s[i][j] = k;//分割点也要改变
                    }
                }

            }
        }

    }
}
