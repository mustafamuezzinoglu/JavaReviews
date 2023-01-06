package week07_10_22_2022;

import java.util.Random;

public class T2_ChangingWord {
    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        System.out.println(message);
        String searched = "cat";
        String changed = "dog";
        String result = "";

        while (message.contains(searched)) {

            int indexOfFirstCat = message.indexOf(searched);
            int endOfWord = indexOfFirstCat + searched.length();
            message = message.substring(0, indexOfFirstCat) + changed + message.substring(endOfWord);

        }

        System.out.println(message);


    }
    /*
    Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
     */
}
