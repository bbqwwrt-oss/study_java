package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {
        
        /*
        과수원이 있다.
        배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
        각각 5, 7, 5개.

        1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        2.시간당 전체 과일의 평균 생산 갯수
        단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
        */
       int a1 = 5;
       int a2 = 7;
       int a3 = 5;
       int a4 = a1 += a2 += a3;
       System.out.println("a4 : " + a4);

       float a5 = a4 / 24f;
       System.out.println("a5 : " + a5);

       //int pear = 5; //배
       //int apple = 7; //사과
       //int orange = 5; //오렌지
       //int total = pear + apple + orange;
       //float avg = (float)total / 24;
       //float avg = total / 24f;

    //System.out.println("하루 생산량 : " + total);
    //System.out.println("시간당 평균 : " + avg);
    }
}
