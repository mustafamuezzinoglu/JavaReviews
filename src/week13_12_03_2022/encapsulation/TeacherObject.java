package week13_12_03_2022.encapsulation;

public class TeacherObject {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Adam", 1);
        System.out.println(teacher);
        teacher.setName("XXXXX");
        System.out.println(teacher);
        System.out.println(teacher.getName());

    }
}
