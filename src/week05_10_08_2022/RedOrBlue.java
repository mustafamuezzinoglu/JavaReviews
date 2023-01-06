package week05_10_08_2022;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class RedOrBlue {
    public static void main(String[] args) {

        Scanner ip=new Scanner(System.in);
        String w=ip.next();

        if(w.startsWith("red")){
            System.out.println("red");
        }else if (w.startsWith("blue")) {
            System.out.println("blue");
        }   else{
            System.out.println("\"\"");
        }
        /*
         Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */
    }
}
