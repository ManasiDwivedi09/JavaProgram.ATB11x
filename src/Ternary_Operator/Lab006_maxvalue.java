package Ternary_Operator;

public class Lab006_maxvalue {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(Math.max(x,y));

        String max= x>y? "x is max" : "y is max";
        System.out.println(max);
        // to get output in integer
        int max1 = x>y ? x:y;
        System.out.println(max1);
    }
}
