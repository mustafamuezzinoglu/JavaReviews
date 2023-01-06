package week10_11_12_2022;

import java.util.Arrays;

public class Task4HidePasswords {
    public static void main(String[] args) {
        String[] arr = {"one", "hi", "hold" };

        String[] result = hidePassword(arr);
        System.out.println(Arrays.toString(result));
    }

    public static String[] hidePassword(String[] arr) {
        String[] results = new String[arr.length];
        int index = 0;
        //I need to get each element
        for (String element : arr) {
            //convert letter to stars
            String result = convertLetterToStar(element);
            results[index++] = result;
        }
        return results;
    }

    //this method
    public static String convertLetterToStar(String eachWord) {
        String temp = "";
        for (int i = 0; i < eachWord.length(); i++) {
            temp += "*";
        }
        return temp;
    }

}
/*
Hide Passwords
 Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
                    Ex:
                    Input:
                    {"one", "hi", "hold"}
                    Output:
                    [ ***, **, **** ]
 */