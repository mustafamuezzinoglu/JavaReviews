package week09_11_05_2022;

public class Task7_ {
    public static void main(String[] args) {

        in1020(12, 99);
        in1020(21, 12);
        in1020(8, 99);
        in1020(50, 150);
    }

    private static boolean in1020(int num1, int num2) {

        if (num1 > 10 && num1 < 20 || num2 > 10 && num2 < 20) {
            System.out.println("true");

        }else{
            System.out.println("false");
        }

        return true;

    }


}
/*
Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
 */