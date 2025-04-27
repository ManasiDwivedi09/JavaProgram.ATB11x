package ex_14_OOPs_constructor;

public class Lab004_this_keyword {
    public static void main(String[] args) {
        MyHuman p1 = new MyHuman("Manasi", 902646999L, 25);
        MyHuman p2 = new MyHuman("Deepanshi", 76937838L, 24);
        MyHuman p3= new MyHuman();
        p1.eat();
        p2.eat();
        p3.eat();
    }
}

class MyHuman {
    String name;
    long ph_no;
    int age;
    MyHuman(){

    }

    MyHuman(String name_arg, long ph_no, int age_arg) {
        this.name = name_arg;    // Very important line!
        this.ph_no = ph_no;
        this.age = age_arg;
        System.out.println("Constructor called for " + name_arg);
    }

    void eat() {
        System.out.println("Inside eat(): " + this.name); //instance variable
    }
}
