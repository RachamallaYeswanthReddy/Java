package Patterns;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Time Complexity - O(n^2)
        for(int i = 1; i<=n; i++){
            System.out.println("*".repeat(i)); // repeat takes O(n)
        }
        // Time Complexity - O(n^2)
        for(int i=0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
