import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int su1 = sc.nextInt();

        System.out.print("수2 : ");
        int su2 = sc.nextInt();

        int total = 0;//결과출력용 변수

        //su1 과 su2 값을 교환

        if( su1 > su2){
        int tmp = su1;
            su1 = su2;
            su2 = tmp;
        }

        for( int i = su1; i <= su2; i++){
            total += i;
        }
        System.out.println("결과 : " + total);
    }//main
}
