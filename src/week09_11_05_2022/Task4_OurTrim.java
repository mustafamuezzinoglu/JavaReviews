package week09_11_05_2022;

public class Task4_OurTrim {
    public static void main(String[] args) {
       String result=ourTrim("   Hello   ");
        System.out.println(result);
       // System.out.println( ourTrim("   Hello   "));

    }

    private static String ourTrim(String str) {
        String dumy = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            dumy += ch;

        }
        return dumy;


    }


}
/*
Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

                 Input: "  Hello "
                 Output: Hello
 */