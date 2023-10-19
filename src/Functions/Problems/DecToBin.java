package Functions.Problems;

import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int decimal = Binary(num);
        System.out.println(decimal);
    }

    private static int Binary(int num) {
        String n = "";
        while(num>0){
            n+=String.valueOf(num % 2);
            num = num/2;
        }
        return Integer.valueOf(n);
    }
}
