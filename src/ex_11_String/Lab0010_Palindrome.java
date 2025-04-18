package ex_11_String;

public class Lab0010_Palindrome {
    public static void main(String[] args) {
       String userInput= args[0];
        String reverseString= reverseString(userInput);
        if(reverseString.equals((userInput) ))
            System.out.println("palindrome");
        else
            System.out.println("not");
        System.out.println(reverseStringSBuilder(userInput));
    }
    static String reverseString(String userInput1) {
        String reversed = "";
        for (int i = userInput1.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput1.charAt(i);
        }
        return reversed;
    }
    static String reverseStringSBuilder(String userInput){
        StringBuilder reverse= new StringBuilder(userInput);
        return reverse.reverse().toString();
    }

}
