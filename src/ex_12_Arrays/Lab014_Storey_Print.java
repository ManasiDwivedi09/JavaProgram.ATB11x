package ex_12_Arrays;

import java.util.Scanner;

public class Lab014_Storey_Print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        for(int i= size; i>0; i--){
            for(int j=0;j<i;j++){
            //for(int j=i;j>0;j--){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
