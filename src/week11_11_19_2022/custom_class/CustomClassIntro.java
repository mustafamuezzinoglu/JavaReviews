package week11_11_19_2022.custom_class;

public class CustomClassIntro {
    public static void main(String[] args) {
//        how to create an object

//      class name reference = new keyword constructor
                                        //firstClass(int a, String b, SecondClass secondClass)
        SecondClass secondClass = new SecondClass();
        FirstClass firstObject = new FirstClass(4,"Adam",secondClass);


    }
}
