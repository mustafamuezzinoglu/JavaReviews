package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1FindingHiddennumbers {
    public static void main(String[] args) {

//        int hiddenNumber=6; this is not logical

        Random random = new Random();

        int hiddenNumber = random.nextInt(100) +1; //we have one number in that variable from 1 to 100
        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        do {
            System.out.println("Enter a number");
            int searchedNumber = scan.nextInt();
            if (searchedNumber>hiddenNumber){
                System.out.println("its high decrease the number");
            }else if(searchedNumber<hiddenNumber){
                System.out.println("its low increase the number");
            }
            if (searchedNumber == hiddenNumber) {
                System.out.println("you find the number Congrats!");
                flag = false;
            }else{
                System.out.println("Try again");
            }


        } while (flag);


    }


}
