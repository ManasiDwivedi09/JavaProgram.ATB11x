package ex_12_Arrays;

public class Lab001_basics {
    public static void main(String[] args) {
        int [ ] marks={12,34,52};
        System.out.println(marks[-1]);// ArrayIndexOutOfBoundsException
        // there can be an array of different data type:
        boolean[] bool ={true, false, true};
        char[] ch= {'a','b','d'};
        float [] fl= {3.14f,3f};
        String [] st= new String[3];
        st[0]= "a";
        st[1]= "b";
        st[2]= "c";
    }
}
