package week02_09_17_2022;

public class TemperatureConverter {
    /*
    Create class named "TemperatureConverter" and make a main method

                        - Write a Java program to convert temperature from Fahrenheit to Celsius degree
                        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

                            Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
     */


    public static void main(String[] args) {

        double fahreneit =212.5;
        double celcius=(5 * (fahreneit -32))/9;


        System.out.println("celcius = " + celcius);
        System.out.println(fahreneit+" degree Fahrenheit is equal to "+celcius+" in Celsius");


    }
}
