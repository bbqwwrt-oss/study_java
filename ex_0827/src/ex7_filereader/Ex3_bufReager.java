package ex7_filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_bufReager {
    public static void main(String[] args) {
        
        String path = "C:/myfile/Work3.txt";
        File f = new File(path);

        FileReader fr = null;
        BufferedReader br = null;

        try {
            
            fr = new FileReader(f);
            br = new BufferedReader(fr); //줄단위로 인식가능

            String msg;

            //BufferedReader가 줄 단위로 내용을 읽어온다
            while ( (msg = br.readLine()) != null ) {
                System.out.println(msg);
            }//while

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

            try {
                if( br != null ){
                    br.close();
                }
                if( fr != null ){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }// try catch

        }//finally



    }//main
}
