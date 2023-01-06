package week09_11_05_2022;

public class Task2_isNumberPrimeOrNot {
    public static void main(String[] args) {

        boolean result = isNumberPrimeOrNot(1);    // true
        System.out.println(result);
    }
    private static boolean isNumberPrimeOrNot(int number) {
        boolean isNumberPrimeOrNot = true;

        if (number<2){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isNumberPrimeOrNot = false;
                break;
            }
        }
        return isNumberPrimeOrNot;
    }

}
/*
 Write a method that can check if a number is prime or not
 Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
 */