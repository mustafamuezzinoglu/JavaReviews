package week13_12_03_2022.encapsulation.pack1;

public class Person {

public String name;// if it is public we can reach from everywhere. this package or outside package or other package
String lastName;// if it is default we can reach in the same package but can not reach from the outside of the  package
private int id;// if it is private we can reach in the same class only but can not reach from any package

static protected int age;

public void getId(){
    System.out.println(id);
}

}
