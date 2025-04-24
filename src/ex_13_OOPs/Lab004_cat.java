package ex_13_OOPs;

public class Lab004_cat {
    public static void main(String[] args) {
     cat c1= new cat();// object1
     cat c2;
     new cat();// also an object without reference , object2
        c1.running();
        // c2.running(); this will throw an error as c2 is not an object
        new cat().running(); //object3
        System.out.println(new cat().colour);// object4 by default the value is null

    }
}
class cat{
    String colour;
    void running(){
        System.out.println("running");
    }
}