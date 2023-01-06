package week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {
    public static void main(String[] args) {

        String str="HeLLO";

     /*  str= str.substring(0,2).toUpperCase();
        System.out.println(str);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word =scan.next();*/
        String result=""+str.charAt(0)+str.charAt(1);
        System.out.println("result = " + result);

    }
    /*
Given a string, print the string made of its first two chars, so the String "Hello" or "hello" yields “HE".*/

}

