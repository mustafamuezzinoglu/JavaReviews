package week14_12_10_2022;

public class Largest {
    public static void main(String[] args) {
        String s = "Welcome To Party";
        int upper = 0;
        int lower = 0;

        for (int i = 0; i <s.length(); i++) {
            if  (s.charAt(i) > 'A' && s.charAt(i) <'Z'){
                upper++;
            }else {
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);

    }
}
