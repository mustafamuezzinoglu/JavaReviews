package week18_01_07_2023.abstraction;

public class OracleDatabase extends Database {

    @Override
    void save(String name) {
        System.out.println("I will add " + name + " inside the database");
        names.add(name);
    }

    @Override
    void delete(String name) {
        System.out.println("I will delete " + name + " from  database FYI");
        names.remove(name);
    }

    @Override
    void update(String oldName, String newName) {
        System.out.println("I will delete " + oldName + " from  database FYI and I will add " + newName + " inside the database");
        names.remove(oldName);
        names.add(newName);
    }
}
