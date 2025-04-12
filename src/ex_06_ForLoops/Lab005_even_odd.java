package ex_06_ForLoops;

public class Lab005_even_odd {
    public static void main(String[] args) {
        // to print even number from 1- 50.
       // for(int i=0; i%2==0; i++) {
          //  System.out.println(i);

            // why the value of i not increasing?
            //Now let’s walk through it:
            //
            //i = 0: 0 % 2 == 0 ✅ → so it prints 0
            //
            //i = 1: 1 % 2 == 1 ❌ → condition fails → loop exits

        for(int i=0; i<=50; i++ ){
            if(i%2==0)
                System.out.println("even"  +i);
            else {
                System.out.println("odd " +i);
            }
        }

    }
}
