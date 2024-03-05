package com.zhangdapao.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面
    public LoginJFrame(){
        this.setSize(488,430);
        this.setVisible(true);
        //设置界面标题
        this.setTitle("拼图登录");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);//数字3代表关闭一个界面就终止程序

    }
}
