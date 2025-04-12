package ex_08_while_loop;

import java.util.Scanner;

public class Lab001_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt(), fact = 1;
        if (i == 0 || i == 1)
            System.out.println(fact);
        else {
            while (i >= 1) {
                fact = fact * i;
                i--;
            }
            System.out.println(fact);
        }
    }
}
