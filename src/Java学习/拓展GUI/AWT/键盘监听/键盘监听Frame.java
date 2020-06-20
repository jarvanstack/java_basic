package Java学习.拓展GUI.AWT.键盘监听;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;

class 键盘监听Frame extends Frame {
    public 键盘监听Frame() {
        this.setName("KeyListener");
        this.setLocation(100,100);
        this.setSize(400,300);

        this.setVisible(true);
        new MySystemExit(this);
        this.addKeyListener(new 键盘监听KeyListener());
    }
}