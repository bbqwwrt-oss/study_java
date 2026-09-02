package ex1_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class ChoiceMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setBounds(500,100,400,300);
        f.setLayout(null);

        Choice day = new Choice();
        day.add("일요일");
        day.add("월요일");
        day.add("화요일");
        day.add("수요일");
        day.add("목요일");
        day.add("금요일");
        day.add("토요일");

        day.setBounds(50,50,120,0);

        //Choice객체 감지자 등록
        day.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                System.out.println( day.getSelectedItem() );
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

    }//main
}
