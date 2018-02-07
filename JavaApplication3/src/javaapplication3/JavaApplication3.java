package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println("Q.1 Max : " + max );
        System.out.println("Q.1 Min : " + min );
        
        System.out.println("----------------------");
        System.out.println("Q.2 - MAX_VALUE " + ++max);
        System.out.println("Q.2 - MIN_VALUE " + --min);
        System.out.println("----------------------");

//            for(byte i = 0 ; i<149 ;i++){
//                System.out.println("Q.3 - Loop "+ i);
//            }
    }

}

