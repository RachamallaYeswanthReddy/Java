package Functions.Problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeinRange {
    public static List<Integer> prime(int from, int to) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(5, 15));
    }
}
