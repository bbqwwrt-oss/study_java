package ex2_valuetype;

public class Ex2_valuetype {
    public static void main(String[] args) {
        //문자형 : 홑따옴표 안에 딱 한글자만 저장할 수 있는 자료형
        char ch = 'A';
        char ch2 = 65+1; //아스키코드표 안의 값을 출력(유니코드도 가능)
        System.out.println("ch : " + ch);
        System.out.println("ch2 : " + ch2);

        //실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100; //오류를 내지 않기위해 강제로 소수점을 추가한다.
        f1 = 3.14f; //long과 비슷하게, 플롯 자료형에 넣는다고 알려야함. 
        //float은 기본숫자를 넣을 경우 강제로 뒷에 소수점을 추가 하며, 만약 소수점이 넣어진 숫자를 할경우 f를 붙여 float으로 출력한다는것을 명시

        double d1 = 3.14; //기본실수타입 double
        //float과 다르게 어느 숫자를 넣든 자동적으로 소수점으로 변환하거나 오류없이 잘 받아들인다.
        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);
        //기본이 double 이기에 float을 하기위해서는 f를 추가
    }
}
