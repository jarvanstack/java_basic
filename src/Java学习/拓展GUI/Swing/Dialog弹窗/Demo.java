package Java学习.拓展GUI.Swing.Dialog弹窗;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    private void init() {
        //初始化JFrame
        this.setVisible(true);
        this.setLocation(100, 100);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //容器,放东西
        Container contentPane = this.getContentPane();
        //绝对布局
        contentPane.setLayout(null);
        //按钮
        JButton jButton = new JButton("点击弹出一个对话框");
        //水平居中??无效等待解决，标签有效，按钮无效？
        jButton.setHorizontalAlignment(SwingConstants.CENTER);
        jButton.setSize(200, 50);
        //按钮添加到容器
        contentPane.add(jButton);
        //添加事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DemoDialog弹窗();

            }
        });

    }

    public static void main(String[] args) {
        new Demo().init();
    }
}
