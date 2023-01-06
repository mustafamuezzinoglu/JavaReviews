package week12_11_26_2022.employee;

public class Employee {

    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
/*
we can overload toString method but 'f we want to run 't we need call
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
    */

}
