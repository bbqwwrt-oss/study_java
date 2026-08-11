package ex1_multifor;

public class Ex10_multifor {
    public static void main(String[] args) {
        /*
        13579
        35791
        79135
        91357
        */


        for( int i = 1; i <= 10; i+=2){
            for( int j = 0; j <= 9; j+= 2){

                int num = i + j;
                if( num > 10)
                    num -= 10;
                System.out.print(num + " ");

            }//inner
            System.out.println();
        }//outer

        System.out.println("--------------------------------------------");

        for( int i = 0; i < 5; i++){
            for( int j = 0; j < 5; j++){

                int res = 1+ (i *2)+ (j*2);
                if( res > 10)
                    res -= 10;
                System.out.print(res + " ");

            }//inner
            System.out.println();
        }//outer

    }//main
}
