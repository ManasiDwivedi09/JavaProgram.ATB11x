package ex_015_Single_Inheritance;

import ex_14_OOPs_constructor.Lab001_default_constructor;

public class Lab005_real_example_single_inheritance {
    public static void main(String[] args) {
        Lab003_TestCase1 tc1 = new Lab003_TestCase1();
        tc1.runningTC1();
        System.out.println("-----------------");
        tc1.startBrowser(); // startBrowser() function was common in parent class and in child class
        // since we called child then it has printed the value of child
        // Lab003_TestCase1 tc1 is in same package therefore it will not create problem
        Lab001_default_constructor dc= new Lab001_default_constructor();
        //  since Lab001_default_constructor is a different package therefore we cannot call any function of it. Example do= 'dc.'

    }
}
