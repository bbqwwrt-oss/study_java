package ex01_work;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {
        
        //값 : 100
        //100은(는) 숫자입니까? true
        //값 : abc123
        //abc123은(는) 숫자입니까? false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();
        

        
        Numbersub num = new Numbersub();
        //boolean res = num.isNumber(str);


        //System.out.println(str + "은(는) 숫자입니까? : " + res);
        System.out.println(str + "은(는) 숫자입니까? : " + num.isNumber(str));
        

    }//main
}
