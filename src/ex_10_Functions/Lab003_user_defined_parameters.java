package ex_10_Functions;

public class Lab003_user_defined_parameters {
    public static void main(String[] args) {
        wo_p_wo_r();
        int i= wo_p_r();
        System.out.println(i);
        w_p_wo_r(3, 4);
        System.out.println(w_p_w_r("Manasi", "Dwivedi"));
    }
    static void wo_p_wo_r(){
        System.out.println("without parameter and without return");
    }
    static int wo_p_r(){
        return 10;
    }
    static void w_p_wo_r(int a, int b){
        System.out.println(a+b);
    }
    static String w_p_w_r(String  a, String b){
        String c= a+ b;
        return c;
    }
}
