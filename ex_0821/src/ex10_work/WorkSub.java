package ex10_work;

public class WorkSub {
    private int num = 1;
    private int y;
    private int x;
    private int[][] arr;
    
    public int[][] ma(int size){

        x = size / 2;
        arr = new int[size][size];

        while ( num <= size * size ) {
            
            arr[y][x] = num;

            if( num % size == 0 )
                y++;
            else{
                y--;
                x++;
            }

            if( y < 0 )
                y = size - 1;
            if( x == size )
                x = 0;
            
            num++;

        }

     return arr;
    }

}
