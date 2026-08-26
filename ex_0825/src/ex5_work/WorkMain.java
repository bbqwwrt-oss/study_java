package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // id: aaa
        // pw: 1111
        // aaa/1111
        // =========
        // id: bbb
        // pw: 2222
        // aaa/1111
        // bbb/2222
        // =========

        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<>();
        outer: while (true) {

            System.out.print("id : ");
            String id = sc.next();

            System.out.print("pw : ");
            int pw = sc.nextInt();

            for( int i = 0; i < list.size(); i++ ){
                if( list.get(i).getId().equals(id) )
                            System.out.println("아이디가 중복됩니다");
                            continue outer;
            }

            User us = new User();
            us.setId(id);
            us.setPw(pw);

            // for (int i = 0; i < list.size(); i++) {
            //     if (id.equals(list.get(i).getId())) {
            //         System.out.println("아이디가 중복됩니다");
            //         continue outer;
            //     }
            // }
            
            list.add(us);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()
                        + "/" +
                        list.get(i).getPw());
            }
            System.out.println("=====================");
        }

        // List <String> id1 = new ArrayList<>();
        // List <Integer> pw1 = new ArrayList<>();

        // while ( true ) {

        // System.out.print("id : ");
        // String str = sc.next();
        // System.out.print("pw : ");
        // int res = sc.nextInt();

        // id1.add(str);
        // pw1.add(res);

        // for( int i = 0; i < id1.size(); i++){
        // System.out.printf("%s / %d 회원\n", id1.get(i) , pw1.get(i));
        // }

        // }

    }
}
