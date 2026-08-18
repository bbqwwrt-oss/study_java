package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 ox값을 계산하여 출력하기
        //======================================
        //입력 : ooxxo / 12001
        //결과 : 4

        Scanner sc = new Scanner(System.in);    
        System.out.print("입력 : ");
        String str = sc.next();
        
                int cnt = 0;
                int sum = 0;

  for( int i = 0; i < str.length(); i++){

    if(str.charAt(i) =='o'){
        cnt++;
    }else{
        cnt = 0;
    }


    sum += cnt;
  }
  System.out.println("결과 : " + sum);

//             for( int j = 0; j < i; j++){
//                 if( str.charAt(i) == 'o'){
//                     o++;
//                 }else{
//                     continue outer;
//                 }
//             }//inner

//         }//outer
//         Scanner sc = new Scanner(System.in);

//         int o = 0;
        
//         System.out.print("입력 : ");
//         String str = sc.next();

//   outer:for( int i = 0; i < str.length(); i++){

//             for( int j = 0; j < i; j++){
//                 if( str.charAt(i) == 'o'){
//                     o++;
//                 }else{
//                     continue outer;
//                 }
//             }//inner

//         }//outer
       // System.out.println("결과 : " + o);
    }//main
}
