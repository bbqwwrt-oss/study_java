package ex6_fileoutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex2_bufOutput {
    public static void main(String[] args) {
        
        String path = "C:/myfile/bufOutput.txt";
        File f = new File(path);

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);

            String msg = "안녕하세요 반갑습니다 aabbcc1122334de5";

            bos.write(msg.getBytes());
            bos.flush(); //기록하고 하는 값을 물리적으로 저장하는 메서드

        } catch (Exception e) {
            // TODO: handle exception
        }finally {
        try {
            if( fos != null ){
                fos.close();
            }
                if( bos != null ){
                    bos.close();
                }
            }//try
            catch (Exception e) {
                e.printStackTrace();
            }
        }//final
            
            
    }//main
}
