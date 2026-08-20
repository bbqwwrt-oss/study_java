package ex01_work;

public class Numbersub {
    
    
    public boolean isNumber( String str ){

        for( int i = 0; i < str.length(); i++ ){

            char ch = str.charAt(i);

            //        48          57
            if( ch < '0' || ch > '9' ){
                return false;
            }//if

        }//for

        return true;

    }//public

}
