package ex4_operator;

public class Ex2_oper {
    public static void main(String[] args) {
        
        //대입연산자
        //특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
        int n1 = 10;
        int n2 = 7;
        n2 += n1; // n2 = n2 + n1;
        System.out.println("n2 : " + n2);

        n2 -= 2; // n2 = n2 - 2;
        System.out.println("n2 : " + n2);
        
        n1 *= n1; // n1 = n1 * n1;
        System.out.println(" n1 : " + n1);

        n1 /= 5; // n1 = n1 / 5;
        System.out.println("n1 : " + n1);

        n1 %= 3; // n1 = n1 % 3;
        System.out.println("n1 : " + n1);

        //비교연산자
        //변수나 상수의 값을 비교하여 결과를 만드는 연산자
        int i1 = 10;
        int i2 = 20;
        boolean res = i1 <= i2; //변수에 담아줘야 오류없음.
        System.out.println("res : " + res);

        res = i1 == i2;
        System.out.println("res : " + res);

        res = i1 != i2; //느낌표를 낫(not)으로 부르며 부정적으로 표현한다.
        System.out.println("res : " + res);

        res = i1 < i2; //크다로 표현하지 않고 <는 작다로 표현한다. < lt로 표현 > gt로 표현 왼쪽에서부터 읽기에 작다 크다로 따로 나눠 부른다.
    }
}
