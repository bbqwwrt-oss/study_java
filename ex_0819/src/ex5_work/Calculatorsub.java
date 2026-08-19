package ex5_work;

public class Calculatorsub {
    
    public int Calcu(int su1, int su2, String y){

        switch (y) {
            case "+":
                //System.out.printf("결과: %d + %d = %d\n", su1, su2, su1+su2);
                return su1+su2;
            case "-":
                //System.out.printf("결과: %d - %d = %d\n", su1, su2, su1-su2);
                return su1-su2;
            case "*":
                //System.out.printf("결과: %d x %d = %d\n", su1, su2, su1*su2);
                return su1*su2;
            case "/":
                //System.out.printf("결과: %d / %d = %.2f\n", su1, su2, (float)su1/su2);
                return su1/su2;
        
            default:
                System.out.println("연산기호가 올바르지 않습니다.");
                return -1;
        }
    }

}
