package ex_05_SwitchCase;

public class Lab009_jdkabove13 {
    public static void main(String[] args) {
        int itemcode= 100;
        switch(itemcode){
            case 001 -> System.out.println("2");
            case 002 -> System.out.println("4");
            default -> System.out.println("default");
            // this arrow will work only for jdk>13 snd no break statement is required
        }
    }
}
