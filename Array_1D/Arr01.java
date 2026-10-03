package Array_1D;

import java.util.Scanner;

public class Arr01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       /*  int [] x = {1,2,3,4,5,6,7,8,9};
        //indexing
        System.out.println(x[5]); 
        x[3]= 69; --- mutability of array
        System.out.print(x[3]); */

       /*  int[] arr = new int[4]; */ // 4 size ka array | 0 to 3|

       /*  int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length; //index -0 to n-1
        for(int i = 0 ; i<n ; i++ ){
            System.out.print(arr[i] + " ");
        } */

        /* int[] karan = new int[7];
        for(int i = 0 ; i<7 ; i++){
            karan[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i<7 ; i++){
            System.out.print(karan[i]);
        } */

        // ✅ Question : Give an Array , print negative elements only 
       
       /*  System.out.println("Enter the array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
         
        System.out.println("Enten the Array ");
       
        for(int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]<0) System.out.print(arr[i]);
        }
         */
    
    //✅Quesiton-02 Print Sum of elements of the array 
     /*  System.out.println("Enter the Num of arry");
      int n = sc.nextInt();
      int [] arr = new int[n];
      System.out.println("Enter the Arry:");
      for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
      }
      int Sum = 1;
      for(int i=0 ; i<n ; i++){
         Sum += arr[i]; 
        Sum= Sum*arr[i];
        
      }
      System.out.print(Sum); */

    //✅Question 03 : Print the Maximum element in the array
    /* System.out.print("Enter the No. of Array");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.print("Write the array");
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
        
    }
    
    int max= arr[0];
    for(int i=0 ; i<n ; i++){
        
        if(arr[i]>max){
            max=arr[i];
        }
         
    }
    System.out.print("Max of the Array is" + max);
    */
   //Homework :- Print the minimum element in the array
 /*   System.out.println("Enter the number of array");
   int n = sc.nextInt();
   int [] arr = new int[n];
   System.out.print("Enter the array");
    for(int i = 0 ; i<n ; i++){
        arr[i]= sc.nextInt();
       
    }
    
    int min = arr[0];
    for(int i=0 ; i<n ; i++){
        if(arr[i]<min){
            min = arr[i];
        }
      
    }
      System.out.print("this is min" + min);
     */

    
    



    
    }
}



    
