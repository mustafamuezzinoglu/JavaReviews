package week08_10_29_2022;

public class Task3_CountWord {
    public static void main(String[] args) {

       String[] input = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

       int count=0;

        for (String name : input) {
            //we need to get first char
        String f=name.charAt(0)+"";
        String l=name.charAt(name.length()-1)+"";
        if(f.equalsIgnoreCase(l))
            count++;
        }
        System.out.println(count);


        /*
         Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
         */
    }
}
