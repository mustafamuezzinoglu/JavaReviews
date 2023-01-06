package week13_12_03_2022.encapsulation;

public class Teacher {

private String name;
private int id;

    public void setName(String name) {
        if(name.equals("XXXXX"))
            System.out.println("you can not use "+ name + " as a name");
        else
            this.name = name;
    }

    public void setId(int id) {
        if (id<0)
            System.out.println("you can not use "+ id+ " as an id");
        else
            this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Teacher (String name, int id){
        setName(name);
        setId(id);






}



}
