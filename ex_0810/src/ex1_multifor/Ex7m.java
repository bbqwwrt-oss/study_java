package ex1_multifor;

public class Ex7m {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                //System.out.printf( j + " * " + i + " = " + (i * j) + "\t ");
                System.out.printf("%d x %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}