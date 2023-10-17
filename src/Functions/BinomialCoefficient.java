package Functions;

import java.util.Scanner;

public class BinomialCoefficient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer n : ");
        int n = sc.nextInt();
        System.out.print("Enter the Integer r : ");
        int r = sc.nextInt();

        int bin = binomial(n,r);
        System.out.println("Binomial coefficient of n at "+n+" and r at "+r + " is "+bin);
    }

    private static int binomial(int n,int r) {
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int fact_n_r= factorial((n-r));
        int bin = fact_n/( fact_r* fact_n_r);
        return bin;
    }


    public static int factorial(int n){
        int factn = 1;
        for(int i =1;i<=n;i++){
            factn *=i;
        }
        return factn;
    }
}
