package week20_01_21_2023.Task3;

public class Employee {
int id;
String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

/*
- Pre condition

Create an Employee class which has id and name attribute
Then create a list of employee

Task 1-a) get the unique names from list of employee

 */