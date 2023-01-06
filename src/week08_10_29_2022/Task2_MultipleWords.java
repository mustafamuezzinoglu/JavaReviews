package week08_10_29_2022;

import java.util.Arrays;

public class Task2_MultipleWords {
    public static void main(String[] args) {

String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

String[] words=str.split(", ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
           // if(word.contains(" "))
            System.out.println(word);
        }




        /*
        Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                  dish washer

         */
    }
}
