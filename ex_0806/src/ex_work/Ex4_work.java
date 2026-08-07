package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 수1 : 10
        // 수2 : 20
        // 연산자 : +
        // 10 + 20 = 30

        Scanner sc = new Scanner(System.in);

        // System.out.print("수1 : ");
        // String a = sc.next();
        // System.out.print("수2 : ");
        // String b = sc.next();
        // System.out.print("연산자 : ");
        // String c = sc.next();

        // String d = "=";
        // String e = (a += b);

        // System.out.println(a += c += b += d += e);

        System.out.print("수1 : ");
        int a = sc.nextInt();
        System.out.print("수2 : ");
        int b = sc.nextInt();
        System.out.print("연산자 : ");
        String c = sc.next();

        switch (c) {

            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case "/":
                System.out.println(a + " / " + b + " = " + ((float)a / b));
                break;

                default:
                    System.out.println("연산자오류");
                    break;

        }
    }// main
}
