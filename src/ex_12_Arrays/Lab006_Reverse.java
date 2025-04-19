package ex_12_Arrays;

public class Lab006_Reverse {
    public static void main(String[] args) {
        int arr[]= new int[]{2,5,4,6,9};
        int reverse[]= reverse_array(arr);
        for(int j=0;j<arr.length; j++){
            System.out.print(reverse[j] +",");
        }

    }
    static int[] reverse_array(int []arr){
       int l= arr.length;
        int b[]= new int[l];
        for(int i=0; i<l;i++){
            b[i]= arr[l-1-i];

        }
        return b;
    }
}
