package ex4_work;

public class Gugudan {

    // 구구단을 출력하는 메서드
    public void gudan(int gu) {

        System.out.println(gu + "단");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", gu, i, i * gu);
        }
    }

}
