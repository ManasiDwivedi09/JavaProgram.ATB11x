package ex_11_String;

public class Lab009_Interview4 {
    public static void main(String[] args) {
        // how many strings are there? ans= 3.
        String s1= "manasi";
        String s2= "dwivedi";
        String s3= s1+ s2;

        // to convert int to string method1:
        int s4= 113;
        String s5= s4+"";
        System.out.println(s5);

        // method2:
        int num = 23;
        String s6 = String.valueOf(num);
        System.out.println(s6);

        // method3:
        int num1 = 23;
        String s7 = Integer.toString(num);
        System.out.println(s7);



    }
}
