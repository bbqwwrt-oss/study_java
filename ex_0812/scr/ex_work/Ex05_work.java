package scr.ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /*
        학생수를 입력하세요: 3
        학생 1의 성적: 90
        학생 2의 성적: 73
        학생 3의 성적: 84
        ===============
        평균 성적: 82. 3333
        ---평균 이상인 학생들---
        => 학생1: 90
        => 학생3: 84
        평균 이상인 학생 수 2
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수: ");
        int s = sc.nextInt();
        System.out.print("점수: ");
        int s1 = sc.nextInt();

        int[] nums = new int[s];

        int num = 0;

        for( int i = 0; i < nums.length; i++ ){
            System.out.printf( "학생의 %d의 %d : ", i + 1 );
            nums[i] = sc.nextInt();
        for( int i = )


        }



    }//main
}
