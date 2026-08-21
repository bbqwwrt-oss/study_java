package ex8_work;

public class WorkSub {
    
    
    
    public void won( int[] coin, int ran ){

        for( int i = 0; i < coin.length; i++){

            int res = ran / coin[i];

            if( res > 0 ){
                System.out.printf("%d원 : %개\n", coin[i], res);

                ran %= coin[i];
            }
 
        }
        
    }

}
