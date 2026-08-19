package ew_work;

public class Ex2_Sub {
    
    public void findActor(String[][] acter, String name, int cnt){

        for( int i = 0; i < acter.length; i++ ){
            if( acter[i][0].equals( "[" + name + "]" ) ){
                for( int j = 0; j < acter[i].length; j++){
                    System.out.println(acter[i][j]);
                }
            }else{
                cnt++;
                if( cnt == acter.length ){
                System.out.println("해당 배우의 정보가 없습니다");
                }
            }
            
            
            
        }//outer
    }//find
}
