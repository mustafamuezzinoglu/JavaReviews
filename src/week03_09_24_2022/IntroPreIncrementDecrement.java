package week03_09_24_2022;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {
        /*
         int a=5;
          print a;
          print the ++a;
          print the --a;
         */

        int a=5;
        System.out.println("a = " + a);
        System.out.println(++a); //a will be 6 and print it
        System.out.println(a++); //line 18 a will be 6
        // but line 19 a will be 7
        System.out.println(a);

        int x=10;

        int number=x++ +100; //number 110
        System.out.println("number = " + number);//x=11
        //int x=11; at backend or memory we have that value in x


        int number2=++x +100;//112
        System.out.println("number2 = " + number2);


    }
}
