package week15_12_17_2022.method_overriding.task1;

public class GarantiBank extends Bank {

    @Override
    public void calculateTheInterest() {
       super.calculateTheInterest();
      //  System.out.println(getCapital() * 8 / 100);
        System.out.println(calculate());
    }

    private int calculate(){
        return getCapital()*15/100;
    }


}
