package ex1_copyarray;

public class Arrmain {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};

        Arrsub as = new Arrsub();
        as.param(array);

        System.out.println("main : " + array[0] );

    }
}
