package ex1_multifor;

public class Ex8_m {
    public static void main(String[] args) {
        /*
         * 12345678910
         * 23456789101
         * 34567891012
         * 45678910123
         * ;
         * ;
         * ;
         * 101234567890
         */

        // for (int i = 0; i <= 9; i++) {
        // for (int j = 0; j <= 9; ++j) {

        // int res = (i + j) % 10 + 1;

        // System.out.print(res + "\t ");
        // }

        // System.out.println();
        // }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                int num = i + j;
                if (num > 10) {
                    num -= 10;
                }
                System.out.print(num + " ");
            } // inner
            System.out.println();
        } // outer

    }// man
}
