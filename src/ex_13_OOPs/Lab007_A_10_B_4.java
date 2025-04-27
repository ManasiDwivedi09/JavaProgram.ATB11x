package ex_13_OOPs;

public class Lab007_A_10_B_4 {
    public static void main(String[] args) {
        person manasi = new person();
        System.out.println("Height: " + manasi.getHeight());
        System.out.println("Alcoholic status: " + manasi.checkAlcoholPreference("wine"));
        manasi.companySwitch(2);
        System.out.println("Is spiritual? " + manasi.isSpiritual());
        manasi.drive();
    }
}

class person {
    // Attributes (Instance variables)
    private String name = "Manasi";
    private String height = "5'0\"";
    private int age = 25;
    private boolean isGraduated = true;
    private boolean isWorking = true;
    private boolean isMarried = false;
    private boolean isSingle = true;
    private double salary = 30000;
    private String hometown = "Lucknow";
    private int siblingCount = 2;

    // Getter for height (for encapsulation)
    public String getHeight() {
        return height;
    }

    // Method Type 1: No return, no argument
    public void drive() {
        System.out.println("Driving a two-wheeler.");
    }

    // Method Type 2: Return, with argument
    public String checkAlcoholPreference(String drink) {
        if (drink.equalsIgnoreCase("daaru")) {
            return "No alcohol";
        } else {
            return "Drink not recognized";
        }
    }

    // Method Type 3: No return, with argument
    public void companySwitch(int years) {
        System.out.printf("In %d years, %s will switch the company.%n", years, name);
    }

    // Method Type 4: Return, no argument
    public boolean isSpiritual() {
        return true;
    }
}
