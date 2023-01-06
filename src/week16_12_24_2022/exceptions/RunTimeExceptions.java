package week16_12_24_2022.exceptions;

import week15_12_17_2022.method_overriding.task3.Employee;

public class RunTimeExceptions {
//    Employee employee; // we need to make it static in order to use inside main method which is static
static Employee employee;
    public static void main(String[] args) {

//        ArithmeticException
        try {
            for (int i = 5; i >=0 ; i--) {
                System.out.println(60/i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); //simple message
            //e.printStackTrace(); // detailed message
        }
// NullPointerException
//You can not reach instance variables or methods from the static block or method
//        java.lang.NullPointerException if you want to reach object fields or methods you have to initialize it. I mean creating object
        try {
            System.out.println(employee.salary());
        } catch (Exception e) {
           e.printStackTrace();
        }

//        NumberFormatException
        String str = "Adam 123.";
        String s= str.substring(str.indexOf(" ")+1);
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

//        ArrayIndexOfBoundException
        int[] arr={1,2,3};
        try {
            System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        String

String name = "Adam";
        try {
            //TODO i will find the solution later lets skip it now
            System.out.println(name.charAt(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//java.lang.StringIndexOutOfBoundsException String index out of range: 4

        System.out.println("YOU FINISHED YOUR TESTS");

    }

}
