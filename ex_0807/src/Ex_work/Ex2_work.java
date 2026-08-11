package Ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 키보드에거 입력받은 2~ 9사이의 값에 해당하는
        // 구구단을 출력
        // 단 :10
        // 2~9사이의값을 입력하세요
        // 단 : 5
        // 5*1=5
        // 5*2=10
        // 5*9=45

        Scanner sc = new Scanner(System.in);

        System.out.print("단 : ");
        int dan = sc.nextInt();

        //if (dan <= 1 || dan >= 10) {
            //System.out.println("2~9사이의값을 입력하세요");
        //} else {
            for (int i = 1; 1 <= 9; i++) {
                //System.out.println(dan + " * " + i + " = " + (dan * i));
             //System.out.printf(" %d * %d = %d", dan, i, (dan*i));
             System.out.printf("%d * %d = %02d\n", dan, i, (dan*i));
            }
        //}

        // if (a <= 1 || a >= 10) {
        // System.out.println("2~9사이의값을 입력하세요");
        // }else{
        // for (int i = 1; i < 10; i++) {
        // System.out.println(a + " * " + i + " = " + (a * i));
        // }
        // }
        // for (int i = 0; i < 10; i++) {
        // switch (a) {
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // case 6:
        // case 7:
        // case 8:
        // case 9:
        // System.out.println(a + " * " + i + " = " + (a * i));
        // break;

        // default:
        // System.out.println("2~9사이의값을 입력하세요");
        // break;

        // }

        // }

        // switch (a) {

        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // case 6:
        // case 7:
        // case 8:
        // case 9:
        // System.out.println(a + " * " + 1 + " = " + (a * 1));
        // System.out.println(a + " * " + 2 + " = " + (a * 2));
        // System.out.println(a + " * " + 3 + " = " + (a * 3));
        // System.out.println(a + " * " + 4 + " = " + (a * 4));
        // System.out.println(a + " * " + 5 + " = " + (a * 5));
        // System.out.println(a + " * " + 6 + " = " + (a * 6));
        // System.out.println(a + " * " + 7 + " = " + (a * 7));
        // System.out.println(a + " * " + 8 + " = " + (a * 8));
        // System.out.println(a + " * " + 9 + " = " + (a * 9));
        // break;

        // default:
        // System.out.println("연산자오류");
        // break;
        // }
    }// main
}
