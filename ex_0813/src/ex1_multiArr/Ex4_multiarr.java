package ex1_multiArr;

public class Ex4_multiarr {
    public static void main(String[] args) {
        
        char[][] carr = new char [2][];
        carr[0] = new char[2];
        carr[1] = new char[3];

        carr[0][0] = '안';
        carr[0][1] = '녕';
        
        carr[1][0] = '하';
        carr[1][1] = '세';
        carr[1][2] = '요';

        for( int i = 0; i < carr.length; i++ ){
            for( int j = 0; j < carr[i].length; j++ ){
                System.out.print(carr[i][j]);
            }//inner
            System.out.println();
        }//iuter

    }//main
}
