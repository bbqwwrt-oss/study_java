package ex2_random;

import java.util.Random;


public class Ex1_random {
    public static void main(String[] args) {
        
        // 2~ 5사이의 난수
        //new Random().nextInt( 난수의 범위(안쓰면 나옴) ) + 시작 수
       // int num = new Random().nextInt( 4 ) + 2;
        //int num = new Random().nextInt( 1378 - 216 + 1 ) + 216;


        //2 ~ 9 사이 

        //int num = new Random().nextInt( 8 ) + 2;

            //for( int i = 1; i <= 9; i++){
                //System.out.println(num + " * " + i + " = " + (num * i));
            //}
        int dan = new Random().nextInt(8) + 2;
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

    

        //System.out.println( num );

    }//main
}
