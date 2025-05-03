package ex_14_OOPs_constructor;

public class Lab006_first_type_of_PC { // PC= parameterized
    public static void main(String[] args) {
        Person1 p1= new Person1();
        System.out.println(p1.name1 +" "+ p1.is_male1 +" "+p1.address1+" "+p1.age1+" "+p1.ph_no1);
        Person1 p2= new Person1("Deepanshi",24,"12 number lane", 82686189L, false);
        System.out.println("---------------------------");
        System.out.println(p2.address1 +" "+ p2.name1+" "+ p2.age1+" "+p2.is_male1+" "+p2.ph_no1);
    }
}
class Person1{
    String name1;
    int age1;
    String address1;
    long ph_no1;
    boolean is_male1;

    // default constructor
    Person1(){
        this.name1= "Manasi";
        this.age1= 25;
        this.address1= "275 senani vihar";
        this.ph_no1= 82462624L;
        this.is_male1=false;
    }
    //parameterized constructor
    Person1(String name_pc, int age_pc, String address_pc,long ph_no_pc, boolean is_male_pc){
        this.name1= name_pc;
        this.age1= age_pc;
        this.address1= address_pc;
        this.ph_no1= ph_no_pc;
        this.is_male1=is_male_pc;
    }
}