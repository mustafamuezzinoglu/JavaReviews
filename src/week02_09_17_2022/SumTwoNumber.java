package week02_09_17_2022;

public class SumTwoNumber {
    public static void main(String[] args) {

        /*
        1.crate a class named sUMTwoNumber. write a Java program to print the sum of two numbers


         */

        //declare first variable
        int firstNumber = 10;

        //declare the second variable
        int secondNumber = 20;

        //adding two variable and assign in another variable

        int sum = firstNumber + secondNumber;
        //print the result

        //System.out.println(sum);
        System.out.println(sum);
        System.out.println("sum = " + sum);

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        int a = 30;
        String s = "30";

        String s1 = s + a;

        //String + int concatenation
        System.out.println(s + a);








    }
}
