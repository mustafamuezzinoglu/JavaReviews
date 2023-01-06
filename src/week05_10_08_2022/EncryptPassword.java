package week05_10_08_2022;

import java.security.AlgorithmConstraints;

public class EncryptPassword {
    public static void main(String[] args) {
        String password="Cydeo";
        char encryptWith='X';
        String enencryptedPasword="";
        for (int i = 0; i <password.length() ; i++) {
            enencryptedPasword+=""+password.charAt(i)+encryptWith;
        }
        System.out.println(enencryptedPasword);


        /*
        : Given a string password. Encrypt with "x" a given password and print.
    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
    }
}
