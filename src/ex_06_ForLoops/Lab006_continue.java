package ex_06_ForLoops;

public class Lab006_continue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==5)
                continue; // when this if condition becomes true the continue will skip rest of the iteration. It will return to the loop
            System.out.println("hi "+ i);
            System.out.println(i);
        }
    }
}
