package Java学习.拓展GUI.AWT.第一个GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * GUI 的第一个界面
 */
public class Demo {
    public static void main(String[] args) {
        //1.直接ctrl + 点击Frame()查看源码括号需要添加什么东西.
        Frame frame = new Frame("半亩方糖的第一个GUI界面");
        //2.需要设置可见性，直接使用实例 frame.然后看出现的方法来判断有哪些方法可用。
        frame.setVisible(true);
        //3. 由 2 知，可以设置大小 setSize(),看源码.
        frame.setSize(400,400);
        //4. 由 2 知道，可以设置属性,看源码.idea左边可以快捷选择颜色.
        frame.setBackground(new Color(139, 168, 20));
        //5.设置初始坐标
        frame.setLocation(500,100);
        //6.设置窗口固定
        frame.setResizable(false);
        //7.设置窗口监听，退出监听.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.out.println("退出成功!");//打印消息
                System.exit(0);//返回为 0 的退出.
            }
        });



    }
}
