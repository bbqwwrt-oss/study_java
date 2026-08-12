package scr.ex_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {

        // 키보드에서 정수 10개를 입력받아 배열에 담고
        // 가장 많이 등장한 정수와 등장 횟수를 출력
        // 정수 :
        // 1
        // 1
        // 2
        // 2
        // 2
        // 3
        // 4
        // 2
        // 5
        // 6
        // 가장 많이 등장한 숫자 : 2
        // 등장 횟수 : 4

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 : ");

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int conut = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if( arr[i] == arr[j] ){
                    cnt++;
                }
                if( cnt > conut ){
                    conut = cnt;
                    max = arr[i];
                }
            }
        }
        System.out.println("가장 많이 등장 : " + max);
        System.out.print("등장 횟수 : " + conut);

    }// main
}
