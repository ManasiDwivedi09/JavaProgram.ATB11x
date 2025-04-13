package ex_10_Functions;

public class Lab004_Interview_Question {
    public static void main(String[] args) {
        System.out.println(main(10));

        System.out.println(main(true));
    }

        // are multiple main functions allowed?
        //yes, but not exactly the same. public static void main(String[] args) this will remain unique in the program.

//    public static int main(String args) {
//        return 0;
//    }
//    public static String main(String args){
//        return "hi";
//        Why this is a problem:
//        In Java, method overloading is based on parameter type and number, but not just the return type.
//
//                Both methods have:
//
//        Method name: main
//
//        Parameter type: String
//
//        Parameter count: 1
//
//        So to Java, both methods look like:
//
//        java
//                Copy
//        Edit
//        main(String)
//        Even though the return types are different (int vs. String), Java does not consider return type when deciding which method to call, so it throws a compile-time error:
//    }

    // to fix this problem:
    public static int main(int number) {
        return 0;
        // change the argument to int
    }

    public static String main(String args) {
        return "hi";
        // if this string data return type won't be used then thew above  public static int main(String number)
        // will not throw an error
    }
    public static boolean main(boolean args){
        return false;
    }
    public static float main(float args) {
        return 2.13f;
    }
}
