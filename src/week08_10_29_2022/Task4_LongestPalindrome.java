package week08_10_29_2022;

public class Task4_LongestPalindrome {
    public static void main(String[] args) {

        String[] input= {"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
//we need to get one by one

       // 0123456
      //  racecar


        String longestPalindrome1="";

        for (String s : input) {

//is palindrome or not
            boolean isPalindrome= true;

            for (int i =0; i< s.length()/2 ; i++) {

                char ch1=s.charAt(i);
                char ch2=s.charAt(s.length()-i-1);
                if(ch1!=ch2) {
                    isPalindrome = false;
                    break;
                }
            }
        if(isPalindrome && s.length()>longestPalindrome1.length());
            longestPalindrome1=s;
        }
        System.out.println(longestPalindrome1);
        System.out.println("------------------------");
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        // we need to get word one by one

        /*
        0123456
        racecar
         */
        String longestPalindrome="";

        for (String eachWord : words) {

            //is palindrome or not
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length() / 2; i++) {
                //"racecar"
                char ch1 = eachWord.charAt(i);
                char ch2 = eachWord.charAt(eachWord.length() - i - 1);

                if (ch1!=ch2){
                    isPalindrome=false;
                    break;
                }


            }

            if (isPalindrome&&eachWord.length()>longestPalindrome.length())
                longestPalindrome=eachWord;

        }
        System.out.println(longestPalindrome);






        /*
        For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
         */
    }
}
