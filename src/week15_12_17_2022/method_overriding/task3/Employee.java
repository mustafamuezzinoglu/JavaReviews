package week15_12_17_2022.method_overriding.task3;

public class Employee {

    private int baseSalary=10000;


    public int salary(){
        return baseSalary;
    }



}
/*

1- Create a class Employee which has
--baseSalary attribute
--salary() method returns the baseSalary

2- Create a class Manager which has
-- salary() method returns the baseSalary+20000

3- Create a class Clerk which has
-- salary() method returns the baseSalary+10000
 */