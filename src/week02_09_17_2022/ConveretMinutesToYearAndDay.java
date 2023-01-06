package week02_09_17_2022;

public class ConveretMinutesToYearAndDay {

    /*
    Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
     */
    public static void main(String[] args) {

        int minutes=3456789;
        int hour=60;
        int day=24;
        int year=365;

        int i = minutes/hour/day/year;
        System.out.println("i = " + i);
        System.out.println("3456789 minutes is approximately 6 years and 210 days");



    }
}
