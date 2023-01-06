package week10_11_12_2022;

import java.util.ArrayList;

public class WrapperIntro {

    public static void main(String[] args) {
// we learn these data types  int double char boolean

        int a = 2;
        Integer b = 122;
        Integer c = new Integer(12);

//      ArrayList<int> ar = new ArrayList<>();we can not put primitive
        ArrayList<Integer> arrayList = new ArrayList<>();

        String number1 = "100";
        String number2 = "200";
        String result = number1 + number2; //100200 this is string
        System.out.println(result);
//        method job is converting string to int
        int result1 = Integer.parseInt(number1); //100 this is number
        int result2 = Integer.parseInt(number2); //200 this is number
        System.out.println(result1 + result2);

//        What is the difference between parseInt() and valueOf()?
//                ---valueOf()  returns an object (wrapper class)
//        ---parseInt() returns primitive data type

        int i = Integer.parseInt("123");
        Integer integer = Integer.valueOf("123");

//        What is the difference between autoboxing and unboxing
//        autoboxing primitive ---> object (wrapper class)
//        unboxing object(wrapper) ---> primitive

        int i1 = 12;
        Integer integer1 = i1; // autoboxing primitive ---> object (wrapper class)

        Integer integer2 = 12;
        int i2 = integer2;

        ArrayList<Integer> arrayList1 = new ArrayList<>(); //this is collection
        arrayList.add(12);
        arrayList.add(15);

        arrayList.remove(Integer.valueOf("12")); //the method remove 12 returns the object
        arrayList.remove(Integer.parseInt("0")); //the method remove 12 returns the int


    }
}
