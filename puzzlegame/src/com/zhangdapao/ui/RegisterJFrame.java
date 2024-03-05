package com.zhangdapao.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面
    public RegisterJFrame(){
        this.setSize(488,500);
        this.setVisible(true);
        //设置界面标题
        this.setTitle("拼图注册");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);//数字3代表关闭一个界面就终止程序

    }
}
