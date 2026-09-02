package ex3_socket;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatCilent extends Frame implements Runnable{

    TextArea area;
    TextField input;
    Button send_bu;

    //서버접속 및 데이터 전달용 객체
    Socket s;
    BufferedReader in;
    PrintWriter out;
    Thread t;
    
    public ChatCilent(){

        setBounds(500,200,400,500);
        setLayout(null);
        setVisible(true);

        area = new TextArea();
        area.setBounds(10,30,380,400);

        input = new TextField();
        input.setBounds(10,430,300,30);

        send_bu = new Button("전송");
        send_bu.setBounds(310,435,70,40);

        add(input);
        add(send_bu);
        add(area);

        //전송버튼 클릭감지
        send_bu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendData();//서버로 메세지 전달
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                out.println(Util.ENDTOKEN);

            };
        });

        //서버접속 메서드 호출
        connected();

        //전달될 메시지를 감지하기 위한 스레드를 실핼
        t = new Thread(this);
        t.start();
        
    }//
    private void connected(){

    try {
        
        s = new Socket("192.168.0.46",3500);
        in = new BufferedReader( new InputStreamReader(s.getInputStream()));

        out = new PrintWriter(s.getOutputStream(), true);

    } catch (Exception e) {
        // TODO: handle exception
    }
}

//메세지 전송 메서드
private void sendData(){
    
    String msg = input.getText().trim();
    if( msg.length() > 0 ){
        out.println(msg);
    }
    input.setText("");
}

    @Override
    public void run() {

        //전달받은 메세지를 기다렸다가 화면에 출력
        while (true) {
            
            try {
                
                String msg = in.readLine();

                if( msg.equals(Util.ENDTOKEN))
                    break;
                if(msg != null){
                    area.append(msg + "\n");
                }

            } catch (Exception e) {
                // TODO: handle exception
            }

        }//while
        
        //열려있는 스트림들 닫기
        try {
            
            if( out != null )out.close();
            if( in != null )in.close();
            if( s != null )s.close();


        } catch (Exception e) {
            // TODO: handle exception
        }

        System.exit(0);

    }//run

}//pccefir
