package ex_10_Functions;

public class Lab001_return_type {
    public static void main(String[] args) {
        return_void();
        int r= return_int();
        System.out.println(r);
    }
    static void return_void(){
        System.out.println("void");
    }
    static int return_int() {
        return 10;
    }
    static boolean return_bool() {
        return true;
    }
    static String return_string(){
        return "A";
    }
    static char return_char(){
        return 'a';
    }
    static float return_float(){
        return 3.14f;
    }
    static long return_long(){
        return 100l;
    }
    static byte return_byte(){
        return 100;
    }
}
