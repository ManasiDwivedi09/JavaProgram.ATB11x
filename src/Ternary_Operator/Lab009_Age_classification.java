package Ternary_Operator;

public class Lab009_Age_classification {
    public static void main(String[] args) {
//        int age=69;
//        String classification= (age>=18)? (age>60)?"Senior citizen" :"Adult":"Minor";
//        System.out.println(classification);

        //take input from user
        String age= args[0];
//        System.out.println(age1);
//        System.out.println(age1 instanceof String);
       int age2 = Integer.parseInt(age);
//        System.out.println(age2);
//        System.out.println(age2 instanceof Integer);
//        System.out.println(age1 instanceof String);
        String classification= (age2>=18)? (age2>60)?"Senior citizen" :"Adult":"Minor";
        System.out.println(classification);





    }
}
