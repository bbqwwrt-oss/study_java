package ex02_work;

import java.util.Scanner;

public class EncodeMain {
    public static void main(String[] args) {
        
        //입력 : abc123
        //결과 : `~!wer

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();


        Encodesub en = new Encodesub();
        String res = en.encodeing(str);

        System.out.println("결과 : " + res);

    }
}
