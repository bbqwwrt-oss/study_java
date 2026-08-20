package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class Updownsub {
    
Scanner sc = new Scanner(System.in);

    private int random = new Random().nextInt(50) + 1;
    private int count = 0;
    private boolean result = true;

    //정답판별 메서드
    public boolean check( int n ){

        count++;

        if( n < random )
            System.out.println("UP");
        else if( n > random )
            System.out.println("DOWN");
        else{
            System.out.println(count + "회 만에 정답");
            result = false;
        }
    return result;        
    }//check


    // public void fun(int answer, int num, int cnt){

    //         while (answer != num) {
    //             num = sc.nextInt();
    //             cnt++;
    
    //             if (answer > num) {
    //                 System.out.println("UP");
    //             } else if (answer < num) {
    //                 System.out.println("DOWN");
    //             }else{
    //                 System.out.println(cnt + "회만에 정답");
    //             }
    
    //         }

    // }
    }


