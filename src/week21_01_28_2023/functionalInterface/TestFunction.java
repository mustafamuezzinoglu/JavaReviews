package week21_01_28_2023.functionalInterface;

public class TestFunction {

    public static void main(String[] args) {

        MyFuncInterface reverseWord = (n) ->{
        return new StringBuilder(n).reverse().toString();


        };
        System.out.println(reverseWord.test("Hello"));

        MyFuncInterface initial = (n) ->{
            return n.substring(0,2);
        }; //if ypu have one statement you dont need to use curly braces

        System.out.println(initial.test("Hello"));


    }
}
