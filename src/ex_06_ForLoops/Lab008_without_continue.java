package ex_06_ForLoops;

public class Lab008_without_continue {
    public static void main(String[] args) {
        for( int i= 0; i<=10; i++){
            if(i%2==0){
                System.out.println("even ->" +i);

            }
            System.out.println("odd ->" +i);// this line is also executing after the if statement
        }
    }
}
