package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 비교값으로 1 ~ 12월 사이의 값을 준비
        // 준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
        // --------
        // 3월은 31일까지 있습니다.

        // String d = "1";
        // String w = "";

        // switch ( d ) {
        // case "1":
        // w = "1월은 31일까지 있습니다";
        // break;

        // case "2":
        // w = "2월은 31일까지 있습니다";
        // break;

        // case "3":
        // w = "3월은 31일까지 있습니다";
        // break;

        // case "5":
        // w = "5월은 31일까지 있습니다";
        // break;

        // case "6":
        // w = "6월은 31일까지 있습니다";
        // break;

        // case "7":
        // w = "7월은 31일까지 있습니다";
        // break;

        // case "8":
        // w = "8월은 31일까지 있습니다";
        // break;

        // case "9":
        // w = "9월은 31일까지 있습니다";
        // break;
        
        // case "10":
        // w = "10월은 31일까지 있습니다";
        // break;
        
        // case "11":
        // w = "11월은 31일까지 있습니다";
        // break;
        
        // case "12":
        // w = "12월은 31일까지 있습니다";
        // break;
        // }// switch
        
        // System.out.println(w);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("월 : ");
        int month = sc.nextInt();
        
        //int month = 5;
    switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println(month + "월은 31일까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일까지");
                break;

            case 2:
                System.out.println("2월은 28일까지");
                break;

        

        }


 }// main
}
