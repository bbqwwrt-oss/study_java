package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_fileinput {
    public static void main(String[] args) {

        String path = "C:\\myfile\\test.txt";
        File f = new File(path);

        FileInputStream fis = null;

        if (f.exists()) {
            try {
                // 파일과 연결된 입력스트림
                fis = new FileInputStream(f);
                // 스트림은 더이상 읽을것이 없다면 파일의 끝(EOF)인
                // -1을 반환하게 되어있다
                // 한글은 2byte문자이기 때문에 1byte씩 읽어오는것이 사실상 불가능하여 읽는데 문제가 생긴다.
                int code = 0;
                while ((code = fis.read()) != -1) {
                    System.out.print((char) code);
                }
                
            } catch (Exception e) {

            } finally{
                // 사용을 마친 스트림은 반드시 닫아줘야 한다
                try {
                    fis.close();
                    
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }

        // if( f.exists() ){
        // try{
        // //파일과 연결된 입력스트림
        // FileInputStream fis = new FileInputStream(f);
        // //스트림은 더이상 읽을것이 없다면 파일의 끝(EOF)인
        // //-1을 반환하게 되어있다
        // //한글은 2byte문자이기 때문에 1byte씩 읽어오는것이 사실상 불가능하여 읽는데 문제가 생긴다.
        // int code = 0;
        // while ((code = fis.read()) != -1) {
        // System.out.print((char)code);
        // }
        // //사용을 마친 스트림은 반드시 닫아줘야 한다
        // fis.close();
        // }catch(Exception e){

        // }
        // }

    }// main
}
