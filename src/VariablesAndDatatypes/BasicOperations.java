package VariablesAndDatatypes;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" + "+b+" : "+(a+b));
        System.out.print("Enter the Length of the Rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth of the Rectangle:");
        int breadth = sc.nextInt();
        System.out.print("Total Area of the Rectangle:");

        System.out.println(length*breadth);

        // Area of Circle
        System.out.print("Enter the Radius of Circle:");
        Double radius = sc.nextDouble();

        Double area = (3.14)*radius*radius;
        System.out.print("Area of the circle of radius "+radius+" is :"+area);
    }
}
