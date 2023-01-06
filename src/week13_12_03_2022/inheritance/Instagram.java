package week13_12_03_2022.inheritance;

public class Instagram extends MobileApp {

    public Instagram( double version) {
        super("Instagram", version);
    }

    public void postPhoto(){
        System.out.println("The user is posting photo");
    }

}
/*
instead of to write the below codes we can use extends as you see the top

    public String name;
    public double version;

    public void useTheApp(int minutes){
        System.out.println("The user is using " + name + " application for " + minutes + " minutes");
    }
    public void download (){
        System.out.println(name + " application is downloading by the user.");
    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
}
*/




