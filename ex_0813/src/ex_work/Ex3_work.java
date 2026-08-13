package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 값보다 큰 요소를 찾아 출력
        // 입력 : 8
        // 결과 : 10
        int[][] arr = { { 1, 3, 4, 7 },
                        { 10, 2, 9, 3, 8 },
                        { 7, 4, 1 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();

        //int res = 0;
        out: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] > num){
                    System.out.println("결과 : " + arr[i][j]);
                    break out;
                }
                //if (arr[i][j] <= num) {
                    //break;
                //}
                //res = arr[i][j];
            }//inner
        }//outer
        //System.out.println("결과 : " + res);
    }// main
}
