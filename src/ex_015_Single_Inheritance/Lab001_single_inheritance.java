package ex_015_Single_Inheritance;

public class Lab001_single_inheritance {
    public static void main(String[] args) {
        Father f1= new Father();
        Son s1= new Son();
     s1.bhk2(); // this line will call the function bhk2() itself. do not use sout
        System.out.println(s1.height);
        s1.bhk3();
    }
}
class Father{
    String height= "5'10\"";
    void bhk2(){
        System.out.println("2 bhk");
    }
}
class Son extends Father{

    void bhk3(){
        System.out.println("3 bhk");
    }
}