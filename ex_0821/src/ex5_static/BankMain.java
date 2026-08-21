package ex5_static;

public class BankMain {
    public static void main(String[] args) {
        
        Bank b1 = new Bank( "신촌", "02-942-5942" );
        Bank b2 = new Bank( "강남", "02-342-9272" );
        Bank b3 = new Bank( "역삼", "02-525-0293" );
        
        //static은 클래스명. 형시으로 접근가능
        Bank.interest = 0.1f;
        
        b1.info();
        b2.info();
        b3.info();

    }//main
}
