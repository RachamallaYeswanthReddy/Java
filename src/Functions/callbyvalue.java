package Functions;

import java.util.Scanner;

public class callbyvalue {
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b= temp;

        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        int b = sc.nextInt();
        // Swap - values exchange
        swap(a,b);

    }
}