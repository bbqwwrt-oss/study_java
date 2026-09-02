package ex4_hangman;

import java.util.Scanner;

public class PlayGame {

    Scanner sc = new Scanner(System.in);
    char[] star;
    boolean check = false;
    boolean isPlaying = false;
    final char SHAPE = '☆';

    public void play( String word ){

        star = new char[ word.length() ];

        for( int i = 0; i < star.length; i++ ){
            star[i] = SHAPE;
        }//for

        //게임시작
        label : while (true) {
            
            System.out.print("word : ");
            for( int i = 0; i < star.length; i++ ){
                System.out.print(star[i]);
            }
            System.out.print(">> ");
            
            String in = sc.next();
            char ch = in.charAt(0);

            if( ch < 'a' || ch > 'z' || in.length() > 1 ){
                System.out.println("한글자의 영 소문자만 입력하세요");
                continue;
            }

            check = false;
            isPlaying = false;

            for( int i = 0; i < word.length(); i++ ){
                if( star[i] == ch ){
                    System.out.println(ch + "은(는) 이미 입력한적이 있습니다");
                    continue label;
                }

                if( ch == word.charAt(i) ){
                    star[i] = ch;
                    check = true;
                }

                if( star[i] == SHAPE ){
                    isPlaying = true;//아직 게임중 표시
                }

            }

            if( !check ){
                System.out.println(ch + "이(가) 포함되어 있지 않습니다");
            }
            //게임종료
            if( !isPlaying ){
                System.out.println("정답, 게임종료");
                break;
            }
        }

    }// play()

}
