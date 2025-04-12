package ex_08_while_loop;

import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Lab002_guessing_number {
    public static void main(String[] args) {
//        Random random= new Random();
//        int guessnum= random.nextInt( bound: 20) +1;
        Random random = new Random();
      //  int numberToGuess = random.nextInt20)+1;
        int randomnum= random.nextInt( 20)+1;
        System.out.println(randomnum);
        Scanner sc= new Scanner(System.in);
        int guessnum = sc.nextInt();
        while(true){
            if(guessnum< randomnum)
                System.out.println("too low, try again");
            else if(guessnum> randomnum)
                System.out.println("too high, try again");
            else{
                System.out.println("correct");
                break;}
        guessnum = sc.nextInt();

        }
    }
}
