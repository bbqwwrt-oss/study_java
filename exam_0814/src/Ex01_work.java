public class Ex01_work {
    public static void main(String[] args) {
        
       int p = 5;
       int a = 7;
       int o = 5;

      //int all = 0; 
      int total = p + a + o;
       //float t = 0;
    float avg = total / 24f;
       //all += p + a + o;

       //t += (float) all / 24; 

       //System.out.println("총 갯수 : " + all);
       //System.out.println("시간당 평균 생산 : " + t);
       System.out.println("총 갯수 : " + total);
       System.out.printf("시간당 평균 생산 : %.2f ", avg);

    }//main
}
