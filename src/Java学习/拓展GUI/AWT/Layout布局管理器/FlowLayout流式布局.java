package Java学习.拓展GUI.AWT.Layout布局管理器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 这个Demo介绍3种常见的布局.
 * 1.流式布局:
 * 2.方向布局:
 * 3.表格布局:
 */
public class FlowLayout流式布局 {
    public static void main(String[] args) {


        //创建一个窗口.
        Frame frame = new Frame("半亩方糖的Layout");
        //布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); //此处的LEFT参数可选,trailing 后面的
        //创建组件，布局流式布局，添加按钮=============================
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");

        //添加按钮
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);


        //设置位置，大小，颜色
        frame.setLocation(100,100);
        frame.setSize(400,300);
        frame.setBackground(new Color(38, 156, 22));
        //退出
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("exist successfully.");
                System.exit(0);
            }
        });
        //可见性
        frame.setVisible(true);
    }
}
