package week16_12_24_2022.exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            System.out.println(9/0);
            Integer.parseInt("123.");

        }catch (ArithmeticException e ){
            System.out.println("you got the arithmetic exception");
        }catch (NumberFormatException e){
            System.out.println("you have a problem with your number ");
        }catch (Exception e){
            System.out.println("i dont know your exception");
        }


    }

}
