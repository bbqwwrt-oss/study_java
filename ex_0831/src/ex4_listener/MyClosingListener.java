package ex4_listener;

import java.awt.event.WindowEvent;

public class MyClosingListener extends ListenerClass{
    
    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        System.out.println("종료");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("최소화");
    }

}
