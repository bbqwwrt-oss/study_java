package ex06_overlorad;

public class BreadMain {
    public static void main(String[] args) {
        
        //빵을 만들었습니다 <== 메서드 1
        //===============
        //빵을 만들었습니다
        //빵을 만들었습니다
        //요청하신 2개의 빵을 만들었습니다. <== 메서드 2
        //=============================
        //크림빵을 만들었습니다
        //크림빵을 만들었습니다
        //요청하신 2개의 크림빵을  만들었습니다 <== 메서드 3

        Bread b = new Bread();
        b.makeBread();

        System.out.println("================");
        
        b.makeBread(2);
        
        System.out.println("================");

        b.makeBread("피자빵", 3);


    }//main
}
