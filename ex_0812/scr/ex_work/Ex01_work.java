package scr.ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        
        //입력 : 5
        //다섯개의 배열
        // ABCDE배열 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        for( int i =  0; i < n; i++){

            arr[i] = (char)('A' + i);

            System.out.print( arr[i] + " ");
        }

        System.out.println();
        System.out.println("====================");

        char[] crr = new char [n];
        char ch = 'A';

        for( int i = 0; i < crr.length; i++){

            System.out.print(crr[i] = ch++);
        }

        //char[] ch = new char[n];
               
        //for(int i = 0; i < n; i++){

          //  System.out.print( ch[i] );
        //}
    }//main
}
