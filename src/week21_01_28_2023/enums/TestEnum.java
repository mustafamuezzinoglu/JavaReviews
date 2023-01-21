package week21_01_28_2023.enums;

public class TestEnum {

    public static void main(String[] args) {

        String day1 = "Monday";

        switch (day1) {
            case "Monday":
                System.out.println("Today is " +day1);
                break;
            case "Tuesday":
                System.out.println("Today is " +day1);
                break;
            case "Wednesday":
                System.out.println("Today is " +day1);
                break;
            case "Thursday":
                System.out.println("Today is " +day1);
                break;
            case "Friday":
                System.out.println("Today is " +day1);
                break;
            case "Saturday":
                System.out.println("Today is " +day1);
                break;
            case "Sunday":
                System.out.println("Today is " +day1);
                break;
        }

// instead of normal switch statement as upside codes, we can use enum  switch statement like below
Day day2 = Day.Friday;

        switch (day2) {
            case Monday:
                System.out.println("Today is " +day2);
                break;
            case Tuesday:
                System.out.println("Today is " +day2);
                break;
            case Wednesday:
                System.out.println("Today is " +day2);
                break;
            case Thursday:
                System.out.println("Today is " +day2);
                break;
            case Friday:
                System.out.println("Today is " +day2);
                break;
            case Saturday:
                System.out.println("Today is " +day2);
                break;
            case Sunday:
                System.out.println("Today is " +day2);
                break;
        }




    }
}
