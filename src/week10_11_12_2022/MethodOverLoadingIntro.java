package week10_11_12_2022;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {
//        ı want to add two number

        int i = 23;
        double d = 24.5;
        float f = 23.5f; // veya (float) 23.5;

        sum(i, d);
        sum(d, f);

        sum(i, i, i);
        sum(i, i);
    }
// if we change number of parameter we can implement method overloading
    public static void sum(int i, int i1) {

    }

    private static void sum(int i, int i1, int i2) {
    }

//     if we use different order for parameter also we can implement the method overloading
    private static void sum(int i, double d) {

    }

    private static void sum(double d, int i) {

    }
//    if we use different parameter data types also we can implement the method overloading
    private static void sum(double d, float f) {
    }








/*
  // we can use method overloading only changing return type

    private static double sum(int i, double d) {

        return 0;

    }
*/
}
