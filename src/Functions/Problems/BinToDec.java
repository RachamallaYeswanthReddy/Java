package Functions.Problems;

import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int decimal = Decimal(bin);
        System.out.println(decimal);
    }

    private static int Decimal(int bin) {
        int pow = 0;
        int decNum = 0;
        while (bin>0){
            int last = bin%10;
            decNum = decNum+last*(int)(Math.pow(2,pow));
            pow++;
            bin = bin/10;
        }
        return decNum;
    }
}
