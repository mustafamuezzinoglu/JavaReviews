package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_MergeTwoArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(Arrays.toString(mergeTwoArrayListToArray(nums1, nums2)));
    }

    private static int[] mergeTwoArrayListToArray(ArrayList<Integer> first, ArrayList<Integer> second) {
        int[] result = new int[first.size() + second.size()];

        int index = 0;
        for (Integer each : first) {
            result[index++] = each;
        }
        for (Integer each : second) {
            result[index++] = each;
        }

        return result;
    }

}
/*
Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6
 */