package ex_14_OOPs_constructor;

public class Lab003_Parameterized_constructor {
    public static void main(String[] args) {
    Car c1= new Car();
    c1.name="V B";
        System.out.println(c1.name); // if no values were given then string would return null, int would return 0.
        // if c1.name="V B" was not given then name would be Vitara Brezza that is default constructor.
        System.out.println("difference b/w both the o/p --------");
    Car c2= new Car();
        System.out.println(c2.name);
    Car c3= new Car("BMW","SUVs", 1999);
        System.out.println(c3.name);
    }
}
class Car{
    String name;
    String model;
    int year;
   // DC
    Car(){
     name="Vitara Brezza";
     model="xxx";
     year=2010;
        System.out.println("DC");
    }
    // paramterized
    Car(String name_oc, String model_oc, int year_oc){
        this.name= name;
        this.model= model;
        this.year= year;
    }
}
