package ex1_staement;

import java.util.Scanner;

public class Ex3_for {
    public static void main(String[] args) {
        
        //은행이자가 하루에 1월씩 추가된다
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되었는지 출력
        //원금 : 1000
        //예치일 : 5

        Scanner sc = new Scanner(System.in);

        System.out.print("원금 : ");
        int money = sc.nextInt();

        System.out.print("예치일 : ");
        int day = sc.nextInt();

        for( int i =0; i < day; i++){
            money++;
        }

        System.out.println(day + "일 후의 잔액 - " + money);

    }//main
}
