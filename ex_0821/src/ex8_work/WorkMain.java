package ex8_work;

import java.util.Random;

public class WorkMain {
    public static void main(String[] args) {
        
        int[] coin = {500, 100, 50, 10};
        int ran = new Random().nextInt(500) + 1;
        ran *= 10;

        System.out.println("금액 : " + ran);

        WorkSub ws = new WorkSub();
        ws.won(coin, ran);

    }
}
