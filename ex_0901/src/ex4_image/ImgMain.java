package ex4_image;

import java.awt.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;

public class ImgMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);

        f.setBounds(500,100,500,500);
        
        //이미지 참조(배경용)
        ImageIcon img = new ImageIcon("src/images/배경화면.jpg");

        JLabel jl = new JLabel( img );
        jl.setBounds(0,0,700,1300);

        //이미지(버튼)
        ImageIcon img2 = new ImageIcon("src/images/cp.png");
        JButton imgbtn = new JButton(img2);
        imgbtn.setBounds(40,70,175,157);

        //버튼 외곽선 없애기
        imgbtn.setBorderPainted(false);
        //버튼 배경 없애기
        imgbtn.setContentAreaFilled(false);

        f.repaint();

        f.add(imgbtn);
        f.add(jl);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            };
        });

    }//main
}
