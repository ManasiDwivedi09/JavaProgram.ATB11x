package ex_06_ForLoops;

public class Lab007_continue_ex2 {
    public static void main(String[] args) {
        for( int i= 0; i<=10; i++){
            if(i%2==0){
                System.out.println("even ->" +i);
                continue;
            }
            System.out.println("odd ->" +i);
        }
    }
}
