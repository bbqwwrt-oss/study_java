package ex1_multifor;

public class Ex3_multifor {
    public static void main(String[] args) {
        
        char ch = 'A';
        for( int i = 1; i <= 3; i++){
            for( int j = 1; j <= 4; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }

    }//main
}
