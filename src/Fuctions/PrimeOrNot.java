package Fuctions;

public class PrimeOrNot {
    public static boolean prime(int n){
        boolean isPrime = true;
        for (int i=2;i<n;i++){
            if(n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
        System.out.println(prime(94));
        System.out.println(prime(323));
        System.out.println(prime(111));

    }
}
