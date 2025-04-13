package ex_10_Functions;

public class Lab002_user_defined_function {
    public static void main(String[] args) {
        int a1= sum(3,5);
        int a2 = sum(6,7);
        System.out.println(a1);
        System.out.println(a2);
    }
    static int sum(int a, int b){
        int c= a+b;
        return c;
    }
}
