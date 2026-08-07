package ex2_statement;

public class Ex2_switch {
    public static void main(String[] args) {
        
        String str = "A";
        String res = "";

        switch( str ){//비교값

            case "A": //조건값
                res = "90 ~ 100";
                break; // break가 없다면 break와 만날때까지 내려가 값을 낸다.

            case "B":
                res = "80 ~ 89";
                break;

            case "C":
                res = "70 ~ 79";
                break;

            case "D":
                res = "60 ~ 69";
                break;

            case "F":
            //default:
                res = "59점 이하";
                break;

            default:
                res = "올바른 성적을 입력";
                break;

        }//switch

        System.out.println(res);
    }//main
}
