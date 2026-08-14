import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("월 : ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(a + "월은 31일 까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(a + "월은 30일 까지");
                break;

            case 2:
                System.out.println("2월은 28일 까지");
                break;

                default:
            System.out.println(a + "월은 없음");
                break;
        }

        // if( a % 2 == 1 ){
        // System.out.printf("%d월은 31일 까지 있습니다", a);
        // }else{
        // System.out.printf("%d월은 30일 까지 있습니다", a);
        // }

        // 1357 81012
        // 246 911
    }// main
}
