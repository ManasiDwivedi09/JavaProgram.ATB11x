package ex_11_String;

public class Lab003_concat {
    public static void main(String[] args) {
        String s1= "Hello";
        s1= s1.concat("World");
        System.out.println(s1);
        // how many values are present in the string constant pool? Ans=2.
    }
}
