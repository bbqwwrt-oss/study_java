package ew_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //검색 : 조인성
        //[조인성]
        //모가디슈
        //호프

        //검색 : AAAA
        //해당 배우의 정보가 없습니다

        String[][] acter = { {"[송강호]", "박쥐", "괴물", "관상"}, 
                             {"[조인성]", "모가디슈", "호프"}, 
                             {"[이병헌]", "레드", "광해", "놈놈놈"} };

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 : ");
        String name = sc.next();

        int cnt = 0;

       Ex2_Sub sub = new Ex2_Sub();
        sub.findActor(acter, name, cnt);
        

    }//main
}
