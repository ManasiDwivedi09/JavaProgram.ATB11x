package ex_14_OOPs_constructor;

public class Lab001_default_constructor {
    public static void main(String[] args) {
    Baby b1 = new Baby();
    new Baby(); // now 2 objects are created. therefore constructor will be called 2 times.
    Baby b2; // no obj created.
    }
}
class Baby{
    String name;

    void cry(){
        System.out.println("cry");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void eat(){
        System.out.println("drink milk");
    }
    Baby(){
        System.out.println("This is the default class"); // this is the default constructor. After creating b1
        // run the program it will call this constructor automatically.
    }
}
