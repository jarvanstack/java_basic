
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
public class BorderLayout边界布局 {
    public static void main(String[] args) {


        //创建一个窗口.
        Frame frame = new Frame("半亩方糖的Layout");

        frame.setLayout(new BorderLayout());
        //创建组件，布局流式布局，添加按钮=============================
        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");


        //添加按钮同时布局.
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);


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
