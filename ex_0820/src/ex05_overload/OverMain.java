package ex05_overload;

public class OverMain {
    public static void main(String[] args) {
        
        Oversub os = new Oversub();
        os.result();

        os.result( 100 );

        os.result('A');
        os.result("s");

        os.result(1,"s");

        os.result("s", 1);

        

    }//main
}
