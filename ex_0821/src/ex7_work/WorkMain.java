package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        
        //가장 큰값: 20
        int[] arr = {1, 11, 7, 20, 13, 15};


        Worksub ws = new Worksub();
        int res = ws.getBigger(arr);

        System.out.print("가장 큰 값 : " + res);

        // int su = 0;
       

        // for( int i = 0; i < arr.length; i++ ){
        //     if( arr[i] > su )
        //         su += arr[i];
        // }
        // System.out.println(su);


    }
}
