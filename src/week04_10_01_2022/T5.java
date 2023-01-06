package week04_10_01_2022;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an animal name");
        String animal = scan.next().toLowerCase();
        switch (animal) {

            case "cat":
            case "dog":
                System.out.println(animal +" is domestic animal");
                break;

            case "tiger":
                System.out.println(animal +" is wild animal");
                break;
            default :
                System.out.println(animal +" is Unknown animal");
        }
    }
}
