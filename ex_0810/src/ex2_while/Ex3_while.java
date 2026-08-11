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

        int answer = new Random().nextInt(100) + 1;//사용자가 맞춰야할 정답
        System.out.println(answer);
        int num = 0;//사용자가 입력할 값

        while (answer != num) {

            System.out.print("숫자 : ");
            num = sc.nextInt();

            if (answer > num) {
                System.out.println("UP");
            } else if (answer < num) {
                System.out.println("DOWN");
            }else{
                System.out.println("정답");
            }
        }//shile
        //System.out.println("정답입니다");

    }// main
}
