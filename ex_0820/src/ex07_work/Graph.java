package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        
        //0~ 9 사이의 난수를 100개를 발생시키고
        //각 숫자가 몇개씩 만들어젺는지를 그래프화 하시오
        //=========================================
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        // . . . .
        //9의 갯수 : ########## 10

        int ran;
        int cnt = 0;
        String str = "#";

        
        for( int i = 0; i <= 9; i ++ ){
            
            for( int j = 1; j <= 100; j++ ){
                ran = new Random().nextInt(9) + 0;
                
                if( i == j){
                    cnt++;
                }
            }
            System.out.println(i + "의 갯수 : " + cnt);
            
        }     
            
        

    }//main
}
