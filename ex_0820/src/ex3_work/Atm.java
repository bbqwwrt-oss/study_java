package ex3_work;

public class Atm {
    
    private int money;
    
    //입금
    public void deposit( int money ){
        System.out.println("입금성공");
        this.money += money;
    }
    //출금
    public void withdraw( int money ){
        if( this.money - money < 0 ){
            System.out.println("잔액부족");
        }else{
        System.out.println("출금성공");
        this.money -= money;
        }//else

    }
    //잔액확인

    public void balance( int money ){
        System.out.println("잔액 : " + this.money);
    }

}
