import java.util.Scanner;

public class Buildin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        System.out.print("Enter the value of a");
        int a = sc.nextInt();
        System.out.print("Enter the value of b");
        int b = sc.nextInt();
        System.out.print("Enter the value of c");
        int c = sc.nextInt();
        System.out.print("So the greatest Number among is :");
        System.out.println(Math.max(Math.max(a,b),c));
    }
}