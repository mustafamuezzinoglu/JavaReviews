package week20_01_21_2023;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ahmet");
        list.add("rafet");
        list.addAll(Arrays.asList("mehmet","saffet","temel"));
        System.out.println("unsorted list = " + list);
        List<String> result = sortedNames(list);
        System.out.println("sorted list = " + result);

    }

    private static List<String> sortedNames(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        return new ArrayList<>(set);
    }



 /*

  --    create a list put the names
         ahmet
         rafet
         mehmet
         saffet
         temel
     -- create a method and return the sorted list which are unique
      ahmet ,mehmet,rafet,saffet,temel
     */



}
