package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {
        
        //생성자:
        //객체가 생성될 떄 메모리 할당을 위해 딱 한번 반드시 호출되는것
        // ConSub cs = new ConSub();
        //cs.ConSub(); 불가능 / 다시 실행은 불가.

        ConSub[] cs = new ConSub[2];

        cs[0] = new ConSub();
        cs[1] = new ConSub();


    }//main
}
