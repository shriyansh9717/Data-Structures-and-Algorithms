package Array_1D;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,-1,-4,-2};
        int [] x = arr.clone(); //clone do not take any arrgument
        //print(arr); // Method call --> Call the print method and give it my arr array.
       // Arrays.sort(arr); //it change the original array 
        //prints(arr);
        Arrays.sort(x);
        prints(x);
        Arrays.sort(arr);
        print(arr);
    }
    public static void prints(int [] x){ //Method define
        for(int i=0 ; i<x.length ; i++){
            System.out.print(x[i]);
        }
        System.out.println();
    }
    public static void print(int [] arr){ //Method define
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
