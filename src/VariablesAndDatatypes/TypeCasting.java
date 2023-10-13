package VariablesAndDatatypes;

public class TypeCasting {

    public static void main(String[] args) {
//        Byte-> short -> int -> float -> long -> double
//        int a  = 25;
//        long b =a;
        int a = 35;
//        int b =a;
        long b = (long) a ;
        System.out.println(b);

//        char to number
        char ch ='a';
        int num = ch;
        System.out.println(num);
    }
}
