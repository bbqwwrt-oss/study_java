package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class Updownmain {
    public static void main(String[] args) {
        // 1~ 50사이의 난수를 발생 시키고
        // 키보드에서 입력받은 정수를 난수와 비교하기
        // 정수: 30
        // down
        // 정수 : 15
        // up
        // 정수 ::25
        // 3회만에 정답


        Scanner sc = new Scanner(System.in);
        int select = 0;
        boolean check = false;

        Updownsub us = new Updownsub();

        do{

            System.out.print("정수 : ");
            select = sc.nextInt();
            check = us.check( select );

        }while( check ); //check == true


        // int answer = new Random().nextInt(50)+1;
        // int num = 0;
        // int cnt = 0;

        // System.out.print("정수 : ");
        
        // Updownsub s1 = new Updownsub();
        // s1.fun(answer, num, cnt);

    }//main
}
