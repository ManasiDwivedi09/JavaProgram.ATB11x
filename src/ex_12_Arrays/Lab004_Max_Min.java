package ex_12_Arrays;

public class Lab004_Max_Min {
    public static void main(String[] args) {
        //max
        int a1[]={-1,-20,-3,3};
        int max= a1[0];
        for(int j=0;j<a1.length;j++){
            if(a1[j]>max) {
                max = a1[j];
            }
        }
        System.out.println(max);

        // min
        int min = a1[0];
        for(int i=0;i<a1.length;i++){
            if(a1[i]<min)
                min= a1[i];
        }
        System.out.println(min);
    }
}
