package ex2_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class ChoiceMain {
    
    public static void main(String[] args) {
        Frame f = new Frame("질문");
        f.setBounds(500,100,400,300);
        f.setLayout(null);

        Choice day = new Choice();
        day.add("지역선택");
        day.add("서울");
        day.add("경기");
        day.add("인천");
        day.add("광주");
        day.add("대구");
        day.add("대전");
        day.add("부산");

        day.setBounds(50,50,120,0);

        //Choice객체 감지자 등록
        day.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                
                Font font = new Font("", Font.BOLD, 20);
                Label q1 = new Label(day.getSelectedItem() + "을(를) 선택");
                q1.setFont(font);
                q1.setBounds(140, 90, 400, 30);
                
                f.add(q1);
            };
        } );

        //프레임에 Choice객체 추가
        f.add(day);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            };
        });
    }

}
