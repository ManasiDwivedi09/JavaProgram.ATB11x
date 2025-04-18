package ex_11_String;

public class Lab001_Immutable {
    public static void main(String[] args) {
        String name="manasi";
        name.toUpperCase();
        System.out.println(name);// here name is pointing to the lowercase manasi as it is assigned to it.
        // if we want to print uppercase then we need to assign name to the upper case.
        // name= name.to UpperCase();
        name= name.toUpperCase();
        System.out.println(name);
        //two new strings 1st manasi and second MANASI is created in the String constant pool.
        // question: How many strings are present in the String constant pool? Ans= 2.
    }
}
