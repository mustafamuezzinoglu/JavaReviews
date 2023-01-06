package week05_10_08_2022;

import java.util.Scanner;

public class WithOutFirstAndLast {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.next();
        String result=""; //en az iki karakter olması lazım verilen kelimenin o nedenle burada boş bir string oluşturuyoruz ve alta if statement yazıyoruz

        if (word.length()<=2){
            result=word;
        }else{
            result =word.substring(1,word.length()-1);
        }System.out.println(result);


    input.close();
       /*
        Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.
        */
    }
}
