package Patterns;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Time Complexity - O(n^2)
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i)); // repeat takes O(n)
        }
        // Time Complexity - O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        ****  => line -1 contains 4 stars
//        ***   => line -2 contains 3 stars
//        **    => line -3 contains 2 stars
//        *     => line -4 contains 1 stars
        for (int line = 0; line < n; line++) {
            for (int stars = n; stars >= line + 1; stars--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        Half-Pyramid
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.print("\n");
        }
        char ch = 'A';
        for(int line=1;line<=n;line++){
            for(int chars = 1;chars<= line;chars++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
