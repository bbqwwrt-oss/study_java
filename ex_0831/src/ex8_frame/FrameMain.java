package ex8_frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setBounds(500, 100, 700, 600);
        // f.setLayout(null);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {

                Frame s = new Frame();
                s.setLayout(null);
                s.setBounds(600, 250, 500, 200);

                Font font = new Font("궁서체", Font.BOLD, 30);
                Label q1 = new Label("종료하겠습니까?");
                q1.setFont(font);
                q1.setBounds(140, 45, 400, 30);

                Button btn1 = new Button("네");
                Button btn2 = new Button("아니요");

                btn1.setBounds(50, 100, 150, 50);
                btn2.setBounds(300, 100, 150, 50);

                //예, 아니요 버튼이 참조할 감지자 생성
                ActionListener act = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(e.getActionCommand());

                        //버튼들에게 이벤트 감지자 추가
                        switch (e.getActionCommand()) {
                            case "네":
                                System.exit(0);
                                break;

                            case "아니요":
                                s.dispose();
                                break;

                        }
                    }
                };

                
                s.addWindowListener(new WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        s.dispose();
                    };
                });
                
                btn1.addActionListener(act);
                btn2.addActionListener(act);
    
                //s프레임에 컴포넌트 추가
                s.add(btn1);
                s.add(btn2);
                s.add(q1);
    
                s.setVisible(true);

            };
        });

        f.setVisible(true);

    }// main
}
