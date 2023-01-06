package week10_11_12_2022;

public class Task5TargetWordCount {
    public static void main(String[] args) {
        String[] array = {"java", "html", "css", "java", "javascript", "selenium" };
        String target = "java";
        int result = countTheWordInArray(array, target);
        System.out.println(result);
    }

    public static int countTheWordInArray(String[] array, String word) {
        int counter = 0;
        for (String eachWord : array) {
            if (word.equalsIgnoreCase(eachWord)) {
                counter++;
            }
        }
        return counter;
    }
}
/*
 Target Words
  Given an Array of Strings and a target word (String) print how many times the target word is in the Array
                    Ex: 
                    Input: 
                        "java", "html", "css", "java", "javascript", "selenium"
                        Target: java 
                        Output: 2
 */