package ex1_string;

import java.util.Scanner;

public class Ex1_string {
    public static void main(String[] args) {
        
        //String클래스 두 가지 특징
        //1) 객체 생성방법이 2가지 ( 암시적, 명시적 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다.
        
        String s1 = "abc"; // 암시적 객체생성
        String s2 = "abc";
        String s3 = new String("abc"); // new를 붙힌다면 반드시 명시적 객체생성.
        String s4 = new String("abc");

        //==은 객체간 비교에서는 주소값 비교를 한다
        if( s1 == s3 ){
            System.out.println("같습니다.");
        }else{
            System.out.println("다릅니다");

            //String 클래스의 불변의 법칙
            String greet = "안녕";
            greet += "하세요";

            System.out.println( greet );


            // Scanner sc = new Scanner(System.in);
            // System.out.print("연산자 : ");
            // String op = sc.next();

            // if( op. equals("+") )
            //     System.out.println("+연산 할게요");

        }



    }//main
}
