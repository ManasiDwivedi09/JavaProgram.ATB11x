package ex_10_Functions;

import java.util.Scanner;

public class Lab005_Arithmatic_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        if(sc.hasNextInt()){
            System.out.println("Addition: " + add(num1, num2));
        }
        else
            System.exit(0);

//        System.out.println("Subtraction: " + sub(3, 6));
//        System.out.println("Multiplication: " + mul(3, 8));
//        System.out.println("Division: " + div(24, 8));
    }
    static int add(int a, int b){
        int c= a+b;
        return c;
    }
    static int sub(int a1, int b1){
        int c1= a1-b1;
        return c1;
    }
    static int mul(int a2, int b2){
        int c2= a2* b2;
        return c2;
    }
    static int div(int a3, int b3){
        if(b3==0){
            System.exit(0);
        }
        int c3= a3/b3;
        return c3;
    }
}
