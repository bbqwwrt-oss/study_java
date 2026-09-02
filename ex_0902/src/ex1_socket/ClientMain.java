package ex1_socket;

import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) {

        try {
            // 192.168.0.7
            Socket s = new Socket("192.168.0.46", 3000);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
