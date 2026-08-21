package ex6_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 정수 : 9
        // 9은(는) 소수가 아닙니다.

        // 정수 : 7
        // 7은 소수입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        Worksub ws = new Worksub();
        boolean res = ws.isPrime(num);

        if (res) {
            System.out.println(num + "은 소수");
        } else {
            System.out.println(num + "소수아님");
        }

    }// main
}
