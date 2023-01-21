package week21_01_28_2023.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Test2 {
    public static void main(String[] args) {
//        get the Male spartans

        List<Map<String, Object>> result = new ArrayList<>();
//          Spartan                        List of spartan
        for (Map<String, Object> spartan : Spartans.getSpartans()) {
            if (spartan.get("gender").toString().equalsIgnoreCase("Male"))
                result.add(spartan);
        }
        System.out.println("result = " + result);
        System.out.println("result.size() = " + result.size());


    }
}
