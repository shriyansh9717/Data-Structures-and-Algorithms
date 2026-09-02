import java.util.Scanner;

public class SwapingtwoNum {
    public static void swap( ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a ");
        int a = sc.nextInt();
        System.out.print("Enter the number b ");
        int b = sc.nextInt();
        int temp = a;
        a= b;
        b = temp;
        System.out.print(a+" "+b);

    }
     public static void main(String[] args) {
        
        

        swap( );
        
        
    }
}
