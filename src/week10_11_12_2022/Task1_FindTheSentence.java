package week10_11_12_2022;

public class Task1_FindTheSentence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);


    }

    private static void getSentence(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
/* if(( ch>='a' && ch <='z') || ( ch>='A' && ch <='Z') || (ch==' ')){ // Character.isLetter(ch)
                    temp+=ch;
            }
 */
        //if we are talking english letters we can use isAlphabetic()
        // if we are talking other letters we can use isLetter()
        if(Character.isAlphabetic(ch) || ch==' '){
            temp+=ch;
        }
    }
        System.out.println(temp);
    }



}
/*
 Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */