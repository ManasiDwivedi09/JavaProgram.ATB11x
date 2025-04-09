package ex_04_Increment_Decrement_Operator;

public class Lab005_Homework_user_input {
    public static void main(String[] args) {
       String name= args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
