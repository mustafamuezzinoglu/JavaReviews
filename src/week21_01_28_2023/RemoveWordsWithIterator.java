package week21_01_28_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWordsWithIterator {

    public static void main(String[] args) {

//        List<String> list = List.of("apple", "banana", "cherry", "Cydeo", "dog");
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "Cydeo", "dog"));

//        I want to remove all the words that start with "a"

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
         String word = iterator.next();
         if (word.startsWith("a")) {
            iterator.remove();
         }
        }
        System.out.println(words);

//         I want to remove all the words that end with "o"

//        remove all the words which has more than 5 characters
        Iterator<String> iterator2 = words.iterator();

        while (iterator2.hasNext()) {
         String word = iterator2.next();
         if (word.length() > 5) {
            iterator2.remove();
         }
        }
        System.out.println("words : "+words);




    }
}
