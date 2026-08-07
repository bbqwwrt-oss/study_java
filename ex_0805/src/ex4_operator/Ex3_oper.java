package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        
        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        //&&(and)연산자
        //앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false
        boolean res = ( limit - age ) > 5 && (age += 2) > 30;
        System.out.println("&&연산 : " + res); 
        System.out.println("age : " + age); //앞쪽에 거짓이 나온다면 뒤쪽은 연산을 하지 않고 결과를 낸다.

        //||(or) 연산자
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false
        int i1 = 10;
        int i2 = 20;
        res = (i1 += 10) > 20 || i2 - 10 == 11;
        //res = (i1 -= 10) <= 20 || (i2 *= 3) < 11; //앞쪽에 진실이 나온다면 뒤쪽은 연산을 하지 않고 결과를 낸다.
        System.out.println("res : " + res);
        //System.out.println("i2 : " + i2);

        // !(not)연산자
        //참을 거짓으로, 거짓을 참으로 변경하는 연산자
        System.out.println("!연산 : " + !res);//붙어있을때만 적용
        System.out.println(res);//붙어있지않는 다면 적용되지 않음

        res = !res;
        System.out.println(res);//!없이도 결과값을 반전 시킨상태를 유지 가능하다.


    }
}
