package ex_11_String;

public class Lab007_Interview3 {
    public static void main(String[] args) {
        String s1= "hello";
        String s2= "hello";
        // how many objects are there in Scp ? ans= 1

        String s3= new String("hello");
        String s4= new String("hello");
        // how many objects are present in heap area? ans= 2
        // == -> it is used to check the location reference of the 2 obj.
        System.out.println(s1==s3);
        System.out.println(s3==s4); // they are also not equal.
        System.out.println(s1==s2);// yes they are.

        // to check the value
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
