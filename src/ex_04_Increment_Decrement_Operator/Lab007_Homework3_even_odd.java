package ex_04_Increment_Decrement_Operator;

public class Lab007_Homework3_even_odd {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        String eo = num1%2==0? "even": "odd";
        System.out.println(eo);
    }
}
