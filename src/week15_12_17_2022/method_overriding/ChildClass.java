package week15_12_17_2022.method_overriding;

public class ChildClass extends ParentClass {

    //Access modifier should be more visible
    //Return type should be the same
    //Method name should be the same
    // Parameters should be the same


    @Override
    public void  move() {
        System.out.println("Bird is flying");
    }
}
