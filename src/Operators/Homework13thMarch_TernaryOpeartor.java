package Operators;

public class Homework13thMarch_TernaryOpeartor {
    public static void main(String[] args) {
        // using ternary operator
        String grade1 =  args[0];
        int grade= Integer.parseInt(grade1);

       String score;
       score = (grade >90 & grade<100)? "A":(grade>80 & grade<90) ? "B": grade>70 & grade<80?"C":grade>60 & grade<70?"D":"F";
        System.out.println(score);


    }
}
