package ex_11_String;

import java.util.Scanner;

public class Lab0011_vowels_function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        System.out.println(vowels(s));
    }
    static int vowels(String s){
        int l= s.length();
        int count=0;

        for(int i=0; i<l;i++){
            char s1= s.charAt(i);
            if(s1=='a'|| s1=='e'|| s1== 'i'|| s1=='o'|| s1=='u' )
            {
                count++;
            }
        }
        return count;
    }
}
