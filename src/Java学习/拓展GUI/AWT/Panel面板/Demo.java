package Java学习.拓展GUI.AWT.Panel面板;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
    public static void main(String[] args) {


        //创建窗体
        Frame frame1 = new Frame("半亩方糖的第一个Frame");
        //创建Panel,查看源码知道，此处可以设置Layout
        // public Panel(LayoutManager layout) {
        //        setLayout(layout);
        //    }
        Panel panel1 = new Panel();
        //设置Frame的大小，位置，颜色
        frame1.setSize(400,400);
        frame1.setLocation(100,100);
        frame1.setBackground(new Color(103, 168, 100));
        //设置Panel相对Frame的位置,大小,颜色.
        panel1.setLocation(0,0);
        panel1.setSize(400,50);
        panel1.setBackground(new Color(99, 255, 240));

        //将Panel添加到Frame中.
        frame1.add(panel1);
        //设置Frame中的Panel布局Layout
        frame1.setLayout(null);
        //可见，必须有
        frame1.setVisible(true);
        //添加监听点击关闭系统关闭
        //使用适配器，只添加关闭的的方法即可.
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.out.println("退出成功.");
                System.exit(0);

            }
        });
    }
}
