package ex_04_Increment_Decrement_Operator;

public class Lab006_Homework2_MaxUsingUserInput {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max= num1>num2? num1:num2;
        System.out.println(max);
    }
}
