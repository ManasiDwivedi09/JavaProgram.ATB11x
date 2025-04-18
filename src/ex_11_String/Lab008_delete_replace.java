package ex_11_String;

public class Lab008_delete_replace {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder( "java");
        stringBuilder= stringBuilder.append(" programming");
        System.out.println(stringBuilder);

        stringBuilder.delete(5,16);// it will the substring from 5 to 15
        System.out.println(stringBuilder);
        stringBuilder.replace(0,4,"C++"); // it will replace, remember the end index is 4 not 5.
        System.out.println(stringBuilder);
    }
}
