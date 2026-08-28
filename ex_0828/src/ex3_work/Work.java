package ex3_work;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Work {
    public static void main(String[] args) {
        
        //1~45사이에 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기

        //set : 중복값을 허용하지 않는 자바의 Interface
        //TreeSet : 오름차순 정렬
        Random rnd = new Random();
        Set<Integer> set = new TreeSet<Integer>();

        while (set.size() < 6) {
            set.add(rnd.nextInt(45)+1);
        }
        System.out.println(set);

        //set에 담긴 내용을 정수배열레 복사
        Integer[] arr = set.toArray( new Integer[0] );
        for( int num : arr ){
            System.out.print(num + " ");
        }


        // int[] arr = new int[6];
        // Random rnd = new Random();


        // outer:for( int i = 0; i < arr.length; ){

        //     rnd = nextInt(45) +1;


        //     if( arr[i] == num ){
        //         continue outer;
        //     }


        //         i++;

        // }



    }// main
}
