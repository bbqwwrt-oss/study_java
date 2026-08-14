import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        
        int[] lotto = new int[6];

        
        out : for( int i = 0; i < lotto.length; ){
           lotto[i] = new Random().nextInt(45) +1;
           for( int j = 0; j < i; j++ ){
           
                if( lotto[i] == lotto[j]){
                    continue out;
                }
                
            }
            System.out.print( lotto[i] + " ");
            i++;
        }

    }//main
}
