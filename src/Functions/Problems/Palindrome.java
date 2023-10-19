package Functions.Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }

    private static boolean palindrome(int num) {
        String reverse = "";
        int n = num;
        while(n>0){
            reverse += String.valueOf(n%10);
            n = n/10;
        }
        return Integer.valueOf(reverse)== num;
    }


}
