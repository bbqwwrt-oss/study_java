package scr.ex_work;

public class Ex03work {
    public static void main(String[] args) {
        
        //배열 arr에 담긴 값중 가장 큰  값을 출력
        int[] arr = {4, 14, 7, 19, 2, 15};
        //가장큰 값: 19

        int res = arr[0];
        for( int i = 1; i < arr.length; i++){
            if( arr[i] > res ){
                res = arr[i];
            }

        }
    System.out.println("가장 큰 값 : " + res );
    }//main
}
