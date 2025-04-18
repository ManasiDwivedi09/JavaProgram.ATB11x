package ex_07_if_else;

import java.util.Scanner;

public class Lab001_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2= sc.nextInt();
        int s3 = sc.nextInt();
        if(s1<=0|| s2<=0||s3<0) {
            System.out.println("not a triangle");
            System.exit(0);
        }
          if(s1+s2<= s3|| s1+s3<=s2|| s2+s3<= s1)
          {
              System.out.println("not a triangle");
              System.exit(0);
        }
        if (s1==s2 && s2==s3 )
            System.out.println("equilateral");
        else if(s1==s2|| s2==s3|| s3==s1)
            System.out.println("Isosceles");
        else
            System.out.println("scalene");

    }
}
