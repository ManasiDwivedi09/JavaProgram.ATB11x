package ex_12_Arrays;

import java.util.Scanner;

public class Lab005_user_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            Scanner sc1= new Scanner(System.in);

            arr[i]=sc1.nextInt();
        }
        for (int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
    }
}
