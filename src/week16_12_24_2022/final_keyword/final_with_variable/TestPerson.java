package week16_12_24_2022.final_keyword.final_with_variable;

public class TestPerson {

    public static void main(String[] args) {

        Person person =new Person("27-06-1977", "MUSTAFA");
        System.out.println(person);
//        person.birthDay="12/12/1968"; it gives error because person variable with final keyword

        person.setName("Mustafa");
        System.out.println(person);



    }
}
