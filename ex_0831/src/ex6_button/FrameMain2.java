package ex6_button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameMain2 {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);

        f.setBounds(500, 100, 800, 500);

        // 버튼들 생성
        Button btn1 = new Button("버튼 1");
        Button btn2 = new Button("버튼 2");
        Button btn3 = new Button("버튼 3");
        Button btn4 = new Button("버튼 4");

        // 버튼들의 좌표및 크기 결정
        btn1.setBounds(100, 150, 100, 50);
        btn2.setBounds(250, 150, 100, 50);
        btn3.setBounds(400, 150, 100, 50);
        btn4.setBounds(550, 150, 100, 50);

        // 생성된 버튼의 클릭을 감지할 감지자
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println(e.getActionCommand());
                switch ( e.getActionCommand() ) {
                    case "버튼 1":
                        System.out.println("1을 클릭");
                        break;

                    case "버튼 2":
                        System.exit(0);
                        break;

                    case "버튼 3":
                        new NewFrame( f );
                        break;

                }
            }
        };

        btn1.addActionListener(act);
        btn2.addActionListener(act);
        btn3.addActionListener(act);
        btn4.addActionListener(act);

        // 생성된 버튼들을 f에 추가
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            };
        });
        
        
        f.setVisible(true);
    }
}
