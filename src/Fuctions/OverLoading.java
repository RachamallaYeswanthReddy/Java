package Fuctions;

import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        int b = sc.nextInt();
        System.out.print("Enter the Integer c : ");
        int c = sc.nextInt();
        // using parameters
        System.out.println("Sum of Two nums "+a+" + "+b+" is "+sum(a,b));
        System.out.println("Sum of Three nums "+a+","+b+","+c+" is "+sum(a,b,c));
        // using datatypes
        System.out.println(sum(5.4f,1.3f,6.9f));
    }

    private static int sum(int a, int b) {
        return a+b;
    }
    private static int sum(int a, int b,int c) {
        return a+b+c;
    }
    private static float sum(float a, float b,float c) {
        return a+b+c;
    }

}
