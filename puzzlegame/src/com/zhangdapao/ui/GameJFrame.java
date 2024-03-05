package com.zhangdapao.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //主界面
    public GameJFrame(){

        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();


        //设置页面可视化
        this.setVisible(true);
    }










    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的两个选项的对象(功能与关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将每个选项下面的条目添加加到选项
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将两个选项加入到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图小游戏");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);//数字3代表关闭一个界面就终止程序
    }


}
