package ex4_work;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("입력 : ");
        //원본
        String str = sc.next();

        //원본을 뒤집어서 저장할 객체
        CheckWord cw = new CheckWord();
        String rev = cw.check( str );

        

        if( str.equals( rev )  ){
            System.out.println(str + "은(는) 회문");
        }else{
            System.out.println(str + "은(는) 회문 아님");
        }
        

    }//main
}
