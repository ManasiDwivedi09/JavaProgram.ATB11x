package ex_015_Single_Inheritance;

public class Lab004_TestCase2 extends Lab002_common_to_all {
    public static void main(String[] args) {

    }

    void runningTC2() {
        startBrowser(); // coming from parent class Lab002_common_to_all
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
        // we can use any function of parent class

    }
}