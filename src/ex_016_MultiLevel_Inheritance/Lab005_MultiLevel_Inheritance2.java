package ex_016_MultiLevel_Inheritance;

public class Lab005_MultiLevel_Inheritance2 {
    public static void main(String[] args) {
     // Lab003_Son s1= new Lab001_GrandFather(); this is not possible son can't be present when gf was born.
      //  Lab003_Son s1= new Lab002_Father(); also not possible
        Lab003_Son s1= new Lab003_Son(); // it is possible
        // Reverse:
        Lab001_GrandFather g1 = new Lab003_Son(); // gf was born when son was present.
        // This concept is called as Dynamic Dispatch
        g1.gf(); // we can access gf
        // Can we access son using grandfather reference?
       // g1.s(); not possible
        // similarly gf cannot access father.
        g1.home(); // since for g1 the object is Lab003_Son() there it will call this class's function only



    }
}
