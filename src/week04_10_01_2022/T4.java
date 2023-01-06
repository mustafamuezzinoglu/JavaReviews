package week04_10_01_2022;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = scan.nextInt();
        System.out.println("Enter a number too");
        int n2 = scan.nextInt();

        String result = "";
        result = n1 > n2 ? n1 + " is bigger than " + n2 : n2 + " is bigger than " + n1;

        System.out.println("result = " + result);

scan.close();
    }
}
