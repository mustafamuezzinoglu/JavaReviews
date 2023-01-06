package week07_10_22_2022;

import com.sun.tools.javac.Main;

public class T4 {
    public static void main(String[] args) {
        String str = "Adam come here";
       String temp = "";

        while (str.contains(" ")){
            for (int i = str.indexOf(" "); i >= 0; i--) {
                temp += str.charAt(i);
            }
            temp += " ";
            str = str.substring(str.indexOf(" ") + 1);

        }
        for (int i = str.length()-1; i >=0 ; i--) {
            temp+=str.charAt(i);
        }

        System.out.println("Reverse is: " + temp);
    }
}
/*
Reverse each word in a sentence.

    input:

    String str = "Adam come here";

    output:

    madA emoc ereh
 */