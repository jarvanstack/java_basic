package Java学习.拓展GUI.AWT.键盘监听;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 键盘监听KeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("e.getKeyChar(): "+e.getKeyChar());
        System.out.println("e.getKeyCode():"+e.getKeyCode());
    }
}
