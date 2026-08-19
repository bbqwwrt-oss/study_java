package ex5_work;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        //수1 : 5
        //수: 10
        //연산자 : +

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : " );
        int su1 = sc.nextInt();
        
        System.out.print("수2 : " );
        int su2 = sc.nextInt();
        
        System.out.print("연산자 : " );
        String y = sc.next();

        Calculatorsub c1 = new Calculatorsub();
        int res = c1.Calcu(su1, su2, y);

        System.out.print("결과 : " + res);

    }//main
}
