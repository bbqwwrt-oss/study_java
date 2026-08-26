package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //id : aaa
        //aaa
        //id : bbb
        //aaa
        //bbb
        //id : 
        //id : aaa
        //aaa회원은 이미 존재함

        Scanner sc = new Scanner(System.in);
        List <String> list = new ArrayList<>();
        
        // outer:
         while ( true ) {
            
            System.out.print("id : ");
            String str = sc.next();

            //중복체크[1]
            if( list.contains(str) ){
                System.out.println(str + "회원은 이미 존재함");
                continue;
            }
            
            //중복체크[2]
            // for( int i = 0; i < list.size(); i++ ){
            //     if( str.equals(list.get(i)) ){                 
            //         System.out.println(str + "회원은 이미 존재함");
            //         continue outer;
            //     }
            // }



            list.add(str);

            for( int i = 0; i < list.size(); i++){
                System.out.println( list.get(i) + " 회원");      
                }


    }

    }//main
}
