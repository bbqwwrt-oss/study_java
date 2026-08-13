package ex1_multiArr;

public class Ex1_multiarr {
    public static void main(String[] args) {
        
        int[][] test = new int[2][3]; //이차원 배열 이차원 배열이 되면 작은 방에다만 값을 넣을수 있음

        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;
        
        //test[2][0] = 700;//존재하지 않는 방 int [2][3] 방 2개, 0번 1번방

        for( int i = 0; i < test.length; i++){ // 큰 방의 갯수
            for( int j = 0; j < test[i].length; j++){ //
                System.out.print( test[i][j] + " " );
            }//inner
            System.out.println();
        }//outer



    }//main
}
