package Ternary_Operator;

public class Lab008_maxofthreevalue {
    public static void main(String[] args) {
        int x=10;
        int y= 9;
        int z=-7;
        int max= (x>y)? ((x>z)? x:z) :((y>z)? y:z);
        System.out.println(max);

    }
}
