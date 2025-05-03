package ex_14_OOPs_constructor;

public class Lab007_second_type_of_PC {
    public static void main(String[] args) {
        Person2 p= new Person2("Manasi", 25);
        System.out.println(p.age+" "+ p.name2);
    }
}
class Person2{
    String name2;
    int age;

    Person2(String name_arg, int age_arg){
        this.name2= name_arg;
        this.age= age_arg;
    }
}
