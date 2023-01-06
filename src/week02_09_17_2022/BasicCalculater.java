package week02_09_17_2022;

public class BasicCalculater {
    /*
    Create a class named BasicCalculator.
     write a Java program to print the
     sum (addition), multiply, subtract, divide and remainder of two numbers.
     */

    public static void main(String[] args) {

        int num1, secondNumber;
        num1 = 30;
        secondNumber = 40;
        int sum = num1 + secondNumber;
        int substract = num1 - secondNumber;
        int multiply = num1 * secondNumber;
        int divide = num1 / secondNumber;
        int remainder= num1 % secondNumber;


        System.out.println("sum = " + sum);
        System.out.println("substract = " + substract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("remainder = " + remainder);


    }
}
