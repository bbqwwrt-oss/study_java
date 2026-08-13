package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {

        // 홀수 : 3
        // 3x3마방진
        // 08 01 06
        // 03 05 07
        // 04 09 02

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j] ) {
                    arr[0][1] += 1;
                    
                }

                System.out.printf("%02d ", arr[i][j]);
            }
            System.out.println();
        }

    }// main
}
