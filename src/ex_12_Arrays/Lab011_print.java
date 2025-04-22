package ex_12_Arrays;

public class Lab011_print {
    public static void main(String[] args) {
        int [][] arr= new int[][]{{1,2,4},{2,4,3},{5,9,7}};
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++)   // arr[i].length, it will take the length of ith row. Eg- i=0,
                                               // so the length of 0th row is 3. Now, j will run from 0,1,2.
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
