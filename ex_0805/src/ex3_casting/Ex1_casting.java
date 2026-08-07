package ex3_casting;

public class Ex1_casting {
public static void main(String[] args) {
    //casting(형변환)
    //1. 프로모션
    // - 큰 자료형에 작은 자료형을 대입하는 것 (자동)
    double d1 = 100.5; //8byte
    int n1 = 200; //4byte
    d1 = n1;
    System.out.println("d1 : " + d1); 

    int n2 = 100; //4byte
    char ch = 'A'; //2byte
    n2 = ch; // 숫자만 가능하기에 아스키코드값(A=65)으로 변환되어 적용된다.
    System.out.println("n2 : " + n2);
    }
}
