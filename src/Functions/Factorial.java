package Functions;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int value = 1;
        for(int i =1;i<=n;i++){
            value *=i;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer n : ");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("The Factorial of "+n+" is "+factorial);

    }
}
