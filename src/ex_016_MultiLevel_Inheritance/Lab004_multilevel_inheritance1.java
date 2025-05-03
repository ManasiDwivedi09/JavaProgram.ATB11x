package ex_016_MultiLevel_Inheritance;

public class Lab004_multilevel_inheritance1 {
    public static void main(String[] args) {
        Lab003_Son s1= new Lab003_Son();
        s1.gf(); // son can use grandfather's class
        //// how to access the property?
        Lab002_Father f1= new Lab002_Father();
        System.out.println(f1.gold_gf);
        // Dynamic Dispatch
        Lab001_GrandFather gf1 = new Lab003_Son();
        gf1.home(); // suppose  home() was not present in Lab003_Son class then here the home() of father class
        // will be called.
        // comment the home() function in son class and then see the result. This is the use of dynamic dispatch.

        s1.home();
    }
}
