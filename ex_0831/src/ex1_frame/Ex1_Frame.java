package ex1_frame;

import java.awt.*; //swing

public class Ex1_Frame {
    public static void main(String[] args) {
        
        Frame frame = new Frame();

        frame.setSize(300, 200);
        frame.setLocation( 400, 300 ); 
        frame.setBackground(Color.blue);
        
        frame.setVisible(true);

    }//main
}
