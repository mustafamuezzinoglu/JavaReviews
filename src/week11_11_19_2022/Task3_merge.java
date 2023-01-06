package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,3 ,4,5,4, 5};
        int[] arr2 = {4, 5, 6,7,7,8,9,9};
        ArrayList<Integer> uniqueNumbers =fromTwoArraysUniqueElementsToArrayList(arr1, arr2);
        System.out.println("uniqueNumbers = " + uniqueNumbers);

    }

    private static ArrayList<Integer> fromTwoArraysUniqueElementsToArrayList(int[] firstArray, int[] secondArray) {

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int each : firstArray) {
            if(!uniqueNumbers.contains(each))
            uniqueNumbers.add(each);
        }
        for (int each : secondArray) {
            if(!uniqueNumbers.contains(each))
                uniqueNumbers.add(each);
        }

        return uniqueNumbers;
    }
}
/*
Task 3 :

Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */