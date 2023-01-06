package week09_11_05_2022;

public class Task3_IsArmstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(183));
    }
    public static boolean isArmstrong(int num) {

        if (num < 100 && num < 1000) {
            return false;
        }
        int temp= num;

        int n3 = temp % 10;
        temp = temp / 10;
        int n2 = temp % 10;
        int n1 = temp / 10;
        int res = (n1 * n1 * n1) + (n2 * n2 * n2) + (n3 * n3 * n3);

        return res == num;

    }

}
/*
Write a method that can check if a number is armstrong number
Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
 armstrong's numbers are     === 153 370 371 407 === for 3 digits
 */