package ex_13_OOPs;

public class Lab006_can_we_run_all_class_at_same_time { // if we try to run the whole program then only public
    // class will run
    public static void main(String[] args) {
        System.out.println(167);
    }
}
class c1{// if we want then we can run all the other classes separately
    public static void main(String[] args) {
        System.out.println(123);
    }
}
class c2{
    public static void main(String[] args) {
        System.out.println(126);
    }
}
