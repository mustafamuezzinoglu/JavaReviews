package week13_12_03_2022.warmUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        System.out.println(teachers);
        ArrayList<Teacher> result = getteachersNameStartWith("M");
        System.out.println(result);
        ArrayList<Teacher> females = getTeachersByGender('F');
        System.out.println(females);
        ArrayList<Teacher> underage = getTheWhichAge(30);
        System.out.println("underage = " + underage);
    }

    private static ArrayList<Teacher> getTheWhichAge(int age) {

        ArrayList<Teacher> underage = new ArrayList<>();

        //I need to get teacher one by one
        for (Teacher teacher : teachers) {

            // I need to check the name if it is under 30

            if (teacher.age < age)

                // I will put inside result
                underage.add(teacher);

        }
        return underage;
    }
    private static ArrayList<Teacher> getTeachersByGender(char gender) {

        ArrayList<Teacher> result = new ArrayList<>();

        //I need to get teacher one by one
        for (Teacher teacher : teachers) {

            // I need to check the name if it is female

            if (teacher.gender== gender)

                // I will put inside result
                result.add(teacher);
    }

        return result;
    }

    private static ArrayList<Teacher> getteachersNameStartWith(String prefix) {

        ArrayList<Teacher> result = new ArrayList<>();

        //I need to get teacher one by one
        for (Teacher teacher : teachers) {


            // I need to check the name if the name is starting with "M"

            if (teacher.name.startsWith(prefix))

            // I will put inside result
                result.add(teacher);
        }
        return result;
    }

    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {

        Teacher teacher1 = new Teacher("Muhtar", "abc", 'M', LocalDate.of(1987, 1, 1), 1);
        Teacher teacher2 = new Teacher("Gurhan", "def", 'M', LocalDate.of(1977, 1, 1), 2);
        Teacher teacher3 = new Teacher("Aysun", "ghi", 'F', LocalDate.of(1993, 1, 1), 3);
        Teacher teacher4 = new Teacher("Asya", "klm", 'F', LocalDate.of(1995, 1, 1), 4);
        Teacher teacher5 = new Teacher("Adam", "prs", 'M', LocalDate.of(1989, 1, 1), 5);
        Teacher teacher6 = new Teacher("Esin", "uvy", 'F', LocalDate.of(1985, 1, 1), 6);

        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));
    }


}
/*

    2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
 */