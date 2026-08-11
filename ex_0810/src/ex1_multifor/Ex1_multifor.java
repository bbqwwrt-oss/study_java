package ex1_multifor;

public class Ex1_multifor {
    public static void main(String[] args) {

        // 1 2 3
        // 1 2 3
        //1 2 3 4 5
        //for (int i = 1; i <= 3; i++) {
            
            //for (int j = 1; j <= 5; j++) {
                
                //System.out.printf("%d ", j);
            
            //} // inner
            
            //System.out.println();

        //} // outer

        System.out.println("-------------------");

        //54321
        //54321
        //54321
        for (int i = 1; i <= 3; i++) {
            
            for (int j = 5; j >= 1; j--) {
                
                System.out.print( j + "  ");
            
            } // inner
            
            System.out.println();

         } // outer
        

    }// main

}

