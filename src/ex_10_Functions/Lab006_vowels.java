package ex_10_Functions;

public class Lab006_vowels {
    public static void main(String[] args) {
        String s = args[0];
        int l = s.length();
        int count = 0;
        String result = " ";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (count > 0)
                    result += ",";


                result= result+ch;

                count++;


            }

        }
        System.out.println("vowels= " +result);
        System.out.println("count=" +count);


    }
}
