package ex1_multifor;

public class Ex9_m {
    public static void main(String[] args) {

        /*
            *
           ***
          *****
         *******
        *********
        */
      
        for( int i = 0; i < 5; i++){
            for( int j = 0; j < 5 + i; j++){
                if( i + j  > 3 )
                System.out.print("* ");
            else
                System.out.print("  ");
            }//inner
            System.out.println();
        }//outer
    }//man
}

