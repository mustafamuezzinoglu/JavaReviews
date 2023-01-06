package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
//        how to create an arraylist

        ArrayList<String> cities = new ArrayList<>();
//        ArrayList<String> cities = new ArrayList<String>();
//   how to add element
        cities.add("London"); //returns boolean
        cities.add("Paris");
        cities.add("Eskişehir");
        cities.add("Madrid");
//        how to print it
//        for Array -> Arrays.toString(arrayname)
        System.out.println(cities);
//        how to add one element at the beginning
        cities.add(0, "Vienna");
        System.out.println(cities);
//        how to get element
        System.out.println(cities.get(0)); //vienna
//        how to update your element
        System.out.println(cities.set(2, "Newyork")); // set method is returning element which you uptade Paris
        cities.set(2, "Newyork"); // set method is changing element which you uptade
        System.out.println(cities.set(3, "Angara")); // set method is changing element which you uptade Istanbul


        System.out.println("------------------after update---------------");
        System.out.println(cities);
// how to learn position of the element or index of element

        System.out.println(cities.indexOf("Newyork")); //2
        System.out.println(cities.indexOf("Paris")); //if it is not exist you will get -1

        System.out.println(cities.indexOf("New")); //2
//        lastIndexOf()
        System.out.println(cities.lastIndexOf("London"));
//        indexOf and lastIndexOf will give same index if the element is unique
        cities.add("London");
        System.out.println(cities);
//        0         1       2       3       4       5
//        Vienna, London, Newyork, Angara, Madrid, London
        System.out.println(cities.indexOf("London")); //its checking the element from beginning and return the index //1
        System.out.println(cities.lastIndexOf("London"));//its checking the element from last and return the index //5

//ArrayList<int> arrayList = new ArrayList<int>(); it will give me compile error
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);

        System.out.println(numbers.indexOf(1));  //0
        System.out.println(numbers.lastIndexOf(1)); //7

//        how to remove one element
//  index    0  1  2  3  4
//  numbers  2, 3, 4, 5, 1

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
        System.out.println(numbers1);
        numbers1.remove(1); //3
        System.out.println(numbers1);
        Integer b = 4; // 4 sayısını object yapmak için Integer yapısı
        numbers1.remove(b); // it will remove your
        System.out.println(numbers1);
        numbers1.remove(new Integer(5));
        System.out.println(numbers1);

        Integer a= new Integer(4);
//        bulk operation
//        addAll

        ArrayList<String > names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut","Osman", "Seyma"));


//        removeAll


//        containAll


//        retainAll

//        removeIf
        System.out.println("--------------------");
        System.out.println(numbers);
        numbers.removeIf(p-> p<3);//p is each element




    }
}