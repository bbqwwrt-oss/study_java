import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int su = sc.nextInt();

        int i = 2;

        for( ; i < su; i++){
            if( su % i == 0 ){
                break;
            }
        }
        if( i == su ){
            System.out.println(su + "은 소수");
        }else{
            System.out.println(su + "은 소수 아님");
        }

        // if( su == 1 || su % 2 != 1) {
        //     System.out.println(su + "은(는) 소수가 아닙니다");           
        // }else if( su % 2 == 1){
        //     System.out.println(su + "은(는) 소수입니다");
        // }
    }
}
