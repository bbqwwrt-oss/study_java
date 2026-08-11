package ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 두 개의 수의 최대 공략수 출력
        // 수1 : 10
        // 수2 : 4
        // 최대 공약수 : 2
        // 수1 : 18
        // 수2 : 12
        // 최대 공약수 : 6

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();

        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        int res = 0;

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                
                if (i % num1 == 0)
                    if (j % num2 == 0)
                res += i % j;    
            }
            
        } 
        System.out.print("최대공약수 : " + res);
    }//main
}
