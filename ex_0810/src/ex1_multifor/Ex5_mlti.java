package ex1_multifor;

public class Ex5_mlti {
    public static void main(String[] args) {
        

        for( int i = 1; i <= 5; i++){
            for( int j = 1; j <= 5; j++){
                    System.out.printf("%02d ", i * j);

            }
            System.out.println();
        }
    }//main
}
