package week09_11_05_2022;

public class Task6_firstAndlastCharExchanged {
    public static void main(String[] args) {

        System.out.println(firstAndlastCharExchanged("code"));
        System.out.println(firstAndlastCharExchanged("abc"));
        System.out.println(firstAndlastCharExchanged("ba"));
        System.out.println(firstAndlastCharExchanged("Mustafa"));
        System.out.println(firstAndlastCharExchanged("M"));
    }


    private static String firstAndlastCharExchanged(String str) {
        if (str.length() == 1) {
            return str;
        } else {

            String result = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);


            return result;
        }


    }
}
/*
Task 6 :   Write a method that return a new string where the first and last chars have been exchanged.


             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"


 */