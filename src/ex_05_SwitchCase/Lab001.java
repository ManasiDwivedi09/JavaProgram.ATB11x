package ex_05_SwitchCase;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        // 1st method to take i/p:
      //  int user= Integer.parseInt(args[0]);
        //2nd method to take i/p:
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any value from 1 to 7");
        int day= sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid day ");



        }

    }
}
