package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {

        // 1~100 사이의 난수를 만들고
        // 키보드에서 입력받은 값이 정답일때 게임종료
        // ----------------------------------\\
        // 숫자 : 25
        // up
        // 숫자 : 70
        // down
        // 숫자 : 50
        // 정답입니다.

        Scanner sc = new Scanner(System.in);

        int num = new Random().nextInt(100) + 1;
        int num2 = 0;

        while (num != num2) {

            System.out.print("숫자 : ");
            num2 = sc.nextInt();

            if (num > num2) {
                System.out.println("UP");
            } else if (num < num2) {
                System.out.println("DOWN");

            }
        }
        System.out.println("정답입니다");

    }// main
}
