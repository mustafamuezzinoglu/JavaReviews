package week6_10_15_2022;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
/*
 Given a sentence which is string find word how many times repeats in it.
Hint: use substring with for loop
input       String str="Java is java in everywhere is Java";
            String word="Java";
output:3
 */
        String str = "Java is java in everywhere is Java";
        String word = "Java";

        int counter = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            String each = str.substring(i, i + word.length());
            if (each.equalsIgnoreCase(word))
                counter++;//if we have only pne statement after if clause we dont need to use {}

        }
        System.out.println(counter);

    }
}
