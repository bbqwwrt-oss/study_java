package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_list {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(100);//줄줄히
        list.add(100);//뒤로
        list.add(50);//생성
        list.add(1, 60); //중간에 끼워 넣을수 있으며 그만큼 뒤로 밀려님
        list.set(0, 90); //특정 index값을 변경한다.
        list.remove(2); //특정 index값을 골라서 지울수 있다

        if( list.contains(50) ){
            System.out.println("list에 50이 있다");//list에 50이 있을떄 출력됨
        }

        System.out.println("size : " + list.size());
        System.out.println( list );
        System.out.println("2번 index값 " + list.get(2)); //list[2]는 불가능 get을 써야만 가져올수 있음
        
        list.clear();
        System.out.println("size : " + list.size());

    }//main
}
