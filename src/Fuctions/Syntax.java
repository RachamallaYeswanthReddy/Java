package Fuctions;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        int b = sc.nextInt();
        calculate(a,b);
        System.out.println("This using return type  ");
        System.out.println("The Sum of "+a+" and "+b+" is "+calculatesum(a,b));

    }
    public static void calculate(int a, int b){
        System.out.println("The Sum of "+a+" and "+b+" is "+(a+b));
    }
    public static int calculatesum(int a, int b){
        return a+b;
    }

}

// void => empty inplace of that we can have int, string, Long, Char etc..



