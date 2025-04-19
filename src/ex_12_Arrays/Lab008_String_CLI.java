package ex_12_Arrays;

public class Lab008_String_CLI {
    public static void main(String[] args) {
        for(int i=0;i< args.length;i++){
            System.out.println(args[i]);
            // in an array it is necessary to fix a value of an array.
            // but here in String [] args, no value is assigned. This is an exception.
            // by default it can take the values that we have assigned. If 3 values are provided in the input it's
            //length will be 3. If 4 values are provided in the input then it's length is going to be 4.

    }
}}
