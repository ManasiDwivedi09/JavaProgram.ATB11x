package ex_11_String;

public class Lab004_String_Functions {
    public static void main(String[] args) {
        String a="t";
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        String s1= "abcdef";
        //1. charAt()
        System.out.println(s1.charAt(3));
        //2. contains()
        System.out.println(s1.contains("g"));
        //3.equals
        //4. equalsIgnoreCase()
        //5. indexOf()
        System.out.println(s1.indexOf("a"));
        String s2= "manasi";
        System.out.println(s2.indexOf("a"));// there are two 'a' in this string, it will return the first one.
        //6. replace(,)
        System.out.println(s2.replace("manasi", "MANASI"));
        //7. split()
        String[] split= s2.split("a");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        //8. substring() imp:
        System.out.println(s2.substring(1,4));// from lower range to upper range-1
        //9. startswith()
        System.out.println(s2.startsWith("m"));
        //10. trim()
        String s3="   qefjhehj  ";
        System.out.println(s3.trim());
        //11. compareTo()
        System.out.println(s2.compareTo("maasi"));//
        //12.compareToIgnoreCase()

       //13. lastIndexOf()
        System.out.println(s2.lastIndexOf("a"));

    }
}
