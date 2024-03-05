package com.zhangdapao.ui;

import javax.swing.*;

public class test {
    public static void main(String[] args){
        //JFrame是一个JavaBean类
        //属性(长,宽),行为 setVisible()
        //1.创建一个游戏主界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);//单位是像素
        //是页面显示,true显示,false隐藏
        gameJframe.setVisible(true);

        //2.创建登陆界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        //显示页面
        loginJframe.setVisible(true);

        //3.创建一个注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        //页面显示
        registerJframe.setVisible(true);
    }
}
