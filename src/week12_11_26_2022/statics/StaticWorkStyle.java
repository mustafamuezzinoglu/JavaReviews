package week12_11_26_2022.statics;

public class StaticWorkStyle {

    static{
        System.out.println("first static");
    }
    static{
        System.out.println("second static");
    }

    public static void main(String[] args) {
        methodStatic();
        System.out.println("main method");
    }

    static{
        System.out.println("third static");
    }

    public static void methodStatic(){
        System.out.println("method static");
    }


}
