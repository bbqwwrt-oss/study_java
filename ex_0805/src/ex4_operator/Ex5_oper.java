package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {

        // 삼항(조건)연산자
        // 하나의 조건식을 통해 발생하는 결과를 원하는 타입으로
        // 반환할 수 있도록 하는 연산자
        int a = 10;
        int b = 15;
        int res = ++a >= b ? 100 : 200; // 100(진실일시) , 200(거짓일시)
        // int res = ++a >= b ? true : 200; 불가능 보낼수 있는 값은 정해져 있음.
        System.out.println(" res : " + res);

        int n1 = 10;
        int n2 = 20;
        float res2 = (n1 += n1) == n2 ? 3.14f : 5.19f;
        System.out.println("res : " + res2);

        a = 10;
        b = 12;
        char res3 = ++a >= b || (a - 8) + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 'O' : 'X';
        // false || true , true && true , true && true ? O
        System.out.println("res3 : " + res3);

    }// main

}// class end
