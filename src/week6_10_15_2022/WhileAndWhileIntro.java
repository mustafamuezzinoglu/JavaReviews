package week6_10_15_2022;

public class WhileAndWhileIntro {
    public static void main(String[] args) {

        //syntax of while
        boolean flag = true ;

        int i = 0;
//        print the numbers till 100

        while (flag) { // if flag is false exit the loop
            System.out.println(i++);

            if (i == 100) // exit condition , criteria
                flag = false;
        }

        do{
            //statements
        }while(flag);


    }
}
