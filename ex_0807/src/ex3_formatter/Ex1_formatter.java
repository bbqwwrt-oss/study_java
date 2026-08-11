package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
    
        // 저의 나이는 20살 입니다
        int age = 20;
        //System.out.println("저의 나이는" + age + "살입니다");
        System.out.printf("저의 나이는 %d살 입니다\n", age);
        
        //저는 20살이고 3층에 살아요
        //int c = 3;
        //System.out.printf("저의 나이는 %d살 이고 %d층에 살아요", age, c);
        System.out.printf("저의 나이는 %d살 이고 %02d층에 살아요\n", 20, 3);
        
        //나는 박씨야

        System.out.printf("나는 %c씨야\n", '박');

        //나는 A형이야

        System.out.printf("나는 %C형이야\n",'a');

        //원주율은  : 3.141592

        System.out.printf("원주율은 : %.2f\n",3.141592);

        //저는 홀길동 입니다.

        System.out.printf("저는 %s입니다\n", "홍길동");

        System.out.printf("%s\t %d\t %d\n", "김윤", 100, 95);
        
        System.out.printf("%s\t %d\t %d\n", "김길동", 100, 100);

        //오늘 강수량은 15%입니다

        System.out.printf("오늘 강수량은  %d%%입니다\n", 15);

    }//main

    /*
    formatter의 문법
    \n : 강제개행
    \t: 공간 강재개행
    %d : 정수 + 02를 추가시 두자릿수로 출력됨
    %c : 문자(한글자) %C 대문자로 변경시 소문자 영어를 대문자 영어로 바꿔줌.
    %f : 실수 + .2를 넣을경우 소수점 두자리 수만 보여준다.
    %s : 문자열 
    %% : 두개를 넣어야만 %를 넣을수 있다.
    */
}
