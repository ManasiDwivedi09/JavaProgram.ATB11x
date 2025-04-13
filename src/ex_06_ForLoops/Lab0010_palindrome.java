package ex_06_ForLoops;

public class Lab0010_palindrome {
    public static void main(String[] args) {
        String s= args[0];
        int l= s.length(); int count=0;
        for(int i=0; i<l/2;i++){
            char a= s.charAt(i);
            char b= s.charAt(l-1-i);
            if(a==b)
                count++;
        }
        if(count==l/2)
            System.out.println("palindrome");
        else
            System.out.println("no");
    }
}
//package ex_10_Functions;
//
//public class Lab007_palindrome {
//    public static void main(String[] args) {
//        String s = args[0];
//        boolean isPalindrome = true;
//
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (s.charAt(i) != s.charAt(len - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println(s + " is a palindrome.");
//        } else {
//            System.out.println(s + " is not a palindrome.");
//        }
//    }
//}

