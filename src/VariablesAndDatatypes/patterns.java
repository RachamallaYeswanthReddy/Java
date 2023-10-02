package VariablesAndDatatypes;

public class patterns {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.print("*");
        int i = 0;
        String str= "*";
        while(i<=5){
            System.out.println(str.repeat(i)); // repeat method will repeat the string
            i++;
        }
    }
}
