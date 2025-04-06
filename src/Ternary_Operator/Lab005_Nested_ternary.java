package Ternary_Operator;

public class Lab005_Nested_ternary {
    public static void main(String[] args) {
        int a=10;
        String s= (a>10) ?"a": (a>5? "A" :"B" );
        System.out.println(s);
    }
}
