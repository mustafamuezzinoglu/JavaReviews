package week15_12_17_2022.method_overriding.task3;

public class Manager extends Employee {

    @Override
    public int salary() {
        // I am getting base salary from the parent class
        return super.salary()         +20000;
    }
}
