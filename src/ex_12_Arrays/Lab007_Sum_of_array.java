package ex_12_Arrays;

public class Lab007_Sum_of_array {
    public static void main(String[] args) {

// method1:
//        int arr[]= new int[]{2,3,7,12};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum= sum+arr[i];
//        }
//        System.out.println(sum);
//    }
        // method2:
        int arr[]= new int[]{2,4,1,45};
        int sum= sum(arr);
        System.out.println(sum);
    }
    static int sum(int[] arr){
        int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+= arr[i];
       }
       return sum;
    }
}
