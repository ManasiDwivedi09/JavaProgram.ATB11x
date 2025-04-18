package ex_11_String;

public class Lab008_StringBuilder_vs_Buffer {
    public static void main(String[] args) {
        String s0 ="Manasi";
        String s1 = new String("Manasi");

        StringBuffer stringBuffer= new StringBuffer("Manasi");
        StringBuilder stringBuilder = new StringBuilder("Manasi");
        // 4 values are available in Jvm, one in SCP and three in heap area.
        stringBuffer.append(123);
        System.out.println(stringBuffer);

    }
}
