package ex5_label;

public class Ex2_label {
 public static void main(String[] args) {
    
        out : for(int i = 1; i <= 5; i++){

        switch( i ){
            case 1:
                System.out.println("case 1");
                //out이라는 label을 가진
                //바깥쪽 for문을 빠져나간다
                break out;
                
        }


        System.out.println("안녕");

    }

 }  //main 
}
