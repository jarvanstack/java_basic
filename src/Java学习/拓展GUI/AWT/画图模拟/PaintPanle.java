package Java学习.拓展GUI.AWT.画图模拟;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;




public class PaintPanle extends JPanel {
    public static ArrayList points = new ArrayList();
    public PaintPanle() {
        this.setVisible(true);
        this.setBackground(new Color(99, 255, 240));
        //添加鼠标事件.
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                points.add(new Point(e.getX(),e.getY()));
                System.out.println(e.getX()+" "+e.getY());
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //迭代
        g.setColor(new Color(195, 68, 106));
        Iterator iterator= points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x,point.y,10,10);
        }
    }
}
