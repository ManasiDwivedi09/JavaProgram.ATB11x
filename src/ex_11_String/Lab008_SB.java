package ex_11_String;

public class Lab008_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Manasi");
        stringBuilder.append(" Dwivedi");
        System.out.println(stringBuilder);
        // Imp- how many strings are present ? ans=1.
        System.out.println(stringBuilder.reverse());
    }
}
