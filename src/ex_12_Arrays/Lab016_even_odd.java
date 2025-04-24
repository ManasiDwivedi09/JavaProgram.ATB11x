package ex_12_Arrays;

public class Lab016_even_odd {
    public static void main(String[] args) {
        int arr[]={12,3,5,7,0,5};
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)
                System.out.println(arr[i] +" even");
            else
                System.out.println(arr[i]+" odd");
        }
    }
}
