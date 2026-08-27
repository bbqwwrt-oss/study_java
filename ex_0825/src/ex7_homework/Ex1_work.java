package ex7_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    public static void main(String[] args) {
        
        //Arraylist를 두 개 만들고 1 ~ 5사이의 난수를 5개 추가해둔다
        //두 개 리스트의 값을 비교히여 교집합을 출력
        //=======================================================
        //[5, 3, 5, 1, 5]
        //[2. 3. 1. 1. 3]
        //교집합 : [3, 1]
        Random rnd = new Random();

        List<Integer> List1 = new ArrayList<Integer>();
        List<Integer> List2 = new ArrayList<Integer>();

        //교집합을 담기위한 리스트
        List<Integer> common = new ArrayList<Integer>();

        for( int i = 0; i < 5; i++ ){
            List1.add( rnd.nextInt(5) + 1 );
            List2.add( rnd.nextInt(5) + 1 );
        }        
        System.out.println( List1 );
        System.out.println( List2 );
        
        for( int num : List1 ){
            if( List2.contains(num) && !common.contains(num) ){
                common.add(num);
            }
        }
        System.out.print("교집합 : " + common);


    }//main
}
