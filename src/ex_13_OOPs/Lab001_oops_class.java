package ex_13_OOPs;

public class Lab001_oops_class {
    public static void main(String[] args) {
        Person manasi = new Person(); // when we use new keyword an object is created.
        Person p1= new Person(); // p1 is just a reference. Here object is not created yet.`
    }
}
    class Person{
        //Attribute
        String name;
        int age;
        boolean isMale;
        double salary;
        // Behaviour
        String tax_given(int salary, int tax){
           return "Y";
        }
        void tak(){
            System.out.println("talking");
        }


    }

