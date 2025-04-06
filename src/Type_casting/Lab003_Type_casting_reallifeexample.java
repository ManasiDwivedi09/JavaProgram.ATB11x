package Type_casting;

public class Lab003_Type_casting_reallifeexample {
    public static void main(String[] args) {
        int course= 100;
        float gst= 18.25f;
        // explicit typecasting
        int total= course+ (int) gst;
        System.out.println(total);
        // implicit typecasting
        float total1 = course+gst;
        System.out.println(total1);
    }
}
