package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_output {
    public static void main(String[] args) {
        
        File f = new File("C:/myfile/fileOutput.txt");
        FileOutputStream fos = null;

        try {
            
            fos = new FileOutputStream(f);
            String msg = "안녕하세요 반갑습니다"; //"file output stream의 예제입니다"; //덮어쓰로 생성된다. append true로 할경우 내용에 추가를 할수 있게괸다.

            fos.write(msg.getBytes());


        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                if(fos != null ){
                    fos.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }//main
}
