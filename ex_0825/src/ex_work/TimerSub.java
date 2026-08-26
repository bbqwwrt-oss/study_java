package ex_work;

public class TimerSub extends Thread{
    
    private int timer = 0;
    private boolean isCheak = true;

    public void setCheak(boolean isCheak) {
        this.isCheak = isCheak;
    }

    @Override
    public void run() {
        
        while (isCheak) {//isCheck == true
            
            try{

                Thread.sleep(1000);
                timer++;

            }catch(Exception e){

            }

        }//while

        System.out.println(timer + "초");
        
    }



}
