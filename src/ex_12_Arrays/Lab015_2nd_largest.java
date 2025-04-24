package ex_12_Arrays;

public class Lab015_2nd_largest {
    public static void main(String[] args) {
        int arr[]={16,2,3,7,9,15};
        int max=arr[0];
        int sec_max=-9999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!= max)
            {
                sec_max=arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
