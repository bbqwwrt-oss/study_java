package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {
    
        //증감연산자
        //1씩 증가하거나 1씩 감소시키는 연산자
        //선행증감과 후행증감의 차이를 알고있어야 한다
        int a = 10;
        System.out.println("a : " + ++a);//선행 : 즉석에서 숫자를 바꾸며 연산자 먼저 하기에 그대로 출력


        int b = 10;
        System.out.println("b : " + b++);//후행 : 현재는 적용되지 않지만 다음턴에 적용이 된다.
        System.out.println(b);// 뒤늦게 나온 결과

        b++;
        ++b;
        --b;
        b--;
        --b;
        b++;
        --b;
        b++;
        System.out.println(++b);

    }//main
}
