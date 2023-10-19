package Functions.Problems;

import java.util.Scanner;

public class FindProduct {
    public static int product(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        int b = sc.nextInt();
        // Product of a and b
        System.out.println(product(a,b));
    }
}
