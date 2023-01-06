package week12_11_26_2022;

import java.util.Scanner;

public class StudentObject {
    public static void main(String[] args) {
        String name = "Adam";
        week12_11_26_2022.student.Student student1 = new week12_11_26_2022.student.Student(name);
        System.out.println(student1);
//I will get my age and batcnumber from user

        Scanner scanner=new Scanner(System.in);
        System.out.println("please input "+name+"'s age");
        int age= scanner.nextInt();
        student1.age=age;

        System.out.println("please input "+name+"'s batch umber");

        long batch= scanner.nextLong();

        student1.batchNumber=batch;

        System.out.println("student1 = " + student1);

    }
}
class Student{
    public String name;
    public int age;
    public long batchNumber;
    public static String school="Cydeo";

    //    1st constructor: initializes the name ONLY
    public Student(String name) {
        this.name = name;
    }

    //     2nd constructor: initializes name & age (MUST use constructor call to set the name)
    public Student(String name, int age) {
        this(name);     //this.name=name;
        this.age = age;
    }
//    3rd Constructor: initializes name, age ,batchNumber (MUST use constructor call to set the name & age)

    public Student(String name, int age, long batchNumber) {
        this(name, age);     // this.name = name;        this.age = age;
        this.batchNumber = batchNumber;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", school=" + school +
                '}';
    }
}