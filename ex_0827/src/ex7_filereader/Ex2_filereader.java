package ex7_filereader;

import java.io.File;
import java.io.FileReader;

public class Ex2_filereader {
    public static void main(String[] args) {

        //"C:/myfile/Work3.txt"의 내용을 읽어서
        //대문자와 소문자의 갯수를 판별하자
        //===================================
        //대문자 : 1
        //소문자 : 23
        
        String path = "C:/myfile/Work3.txt";
        File f = new File(path);

        FileReader fr = null;

        try {
            
            fr = new FileReader(f);

            int code = 0;

            int Cont = 0;//대문자
            int cont = 0;//소문자

            while ( (code = fr.read()) != -1 ) {  
                if( code >= 'A' && code <= 'Z' ){
                    Cont++;
                }if( code >= 'a' && code <= 'z' ){
                    cont++;
                }        
            }

            System.out.printf("대문자 : %d\n소문자 : %d", Cont, cont);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

            try {
                if( fr != null ){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }//main
}
