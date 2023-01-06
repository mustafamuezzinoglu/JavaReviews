package week09_11_05_2022;

public class Task6ExtraSolution {
    public static void main(String[] args) {

        String str = "ab";
        String frontBack = frontBack(str);

        System.out.println(frontBack);

    }
    public static String frontBack(String str) {

        String frontBack = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(i==0){
                ch=str.charAt(str.length()-1);
            }
            if(i==str.length()-1){
                ch=str.charAt(0);
            }
            frontBack += ch;

        }
        return frontBack;

    }
}
