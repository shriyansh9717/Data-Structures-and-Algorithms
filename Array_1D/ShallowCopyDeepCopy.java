package Array_1D;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int[] arr= {10,20,30};
       /*  int[]x = arr; //know x is sallow copy of arr , it mean know x is arr
        x[0] = 100; */
        int[] y = Arrays.copyOf(arr, arr.length); //deep copy it mean a new array is make so that original arr does not disturbed 
        y[0]=100; 
        System.out.print(arr[0]);
        System.out.print(y[0]);
    }
}
