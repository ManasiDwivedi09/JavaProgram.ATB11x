package ex_14_OOPs_constructor;

public class Lab002_default_constructor2 {
    public static void main(String[] args) {
    WebAutomation w1= new WebAutomation(); // WebAutomation() calls the constructor
    }
}
class WebAutomation{

    WebAutomation(){
        System.out.println("I want to read a CSV file");
        System.out.println("you can do anything you want");
    }
}