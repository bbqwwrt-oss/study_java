package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        //찾을 값 : 10
        //10보다 큰 첫번째 요소: 11
        //해당의 행의 모든 요소:
        //{ 9, 10,11,12}, 
        int[][] arrary = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10,11,12}, 
                           {13, 14,15,16} };

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int num =sc.nextInt();

       out: for (int i = 0; i < arrary.length; i++) {
            for (int j = 0; j < arrary[i].length; j++) {
                
                if( arrary[i][j] > num){
                    System.out.printf("%d 보다 큰 첫번째 요소 : %d", num, arrary[i][j]);
                    System.out.println("해당 행의 모든 요소");
                    
                    for( int k = 0; k < arrary[i].length; k++){
                       
                        System.out.print(arrary[i][k] + " ");
                    }
                    
                    break out;

                }
            
            }
        }
    }//main
}
