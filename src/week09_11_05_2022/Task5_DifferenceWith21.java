package week09_11_05_2022;

public class Task5_DifferenceWith21 {
    public static void main(String[] args) {

        System.out.println(differenceWith21(25));
        System.out.println(differenceWith21(15));

    }

    private static int differenceWith21(int num) {
        int res = 0;
        return (num < 21) ? 21 - num : (num - 21) * 2 ;
        }

}
/*
 Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
 */