package week09_11_05_2022;

public class MethodsIntro {
    public static void main(String[] args) {
//      printHello5Times
        printHello5Times();
//      printHello5Times
        printHello5Times();
//      printHello5Times
        printHello5Times();

//        we want to add two number
        int result = sum(5,6);

//        multiply that number with 2 and show in console
        multiplyWith2AndPrint(result);

        System.out.println(sum(20, 30));

    }

    private static void multiplyWith2AndPrint(int result) {
        System.out.println(result*2);
    }

    private static int sum(int number1, int number2) {
        return number1+number2;
    }

    public static void printHello5Times(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
