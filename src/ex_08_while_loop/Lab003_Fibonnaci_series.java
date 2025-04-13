package ex_08_while_loop;

import java.util.Scanner;

public class Lab003_Fibonnaci_series {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int a= sc.nextInt();

        for(int i=0; i<=a; i++){
            System.out.print(fib(i)+ " ");
        }


    }
    static int fib(int f){
        if(f==0)
            return 0;
        else if(f==1)
            return 1;

        else
            return fib(f-1)+ fib(f-2);
    }


}
