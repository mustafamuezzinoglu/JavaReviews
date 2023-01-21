package week18_01_07_2023.abstraction;

import java.util.ArrayList;

public abstract class Database {
  /*
    We can have cons inside the abstract class
    in order to initialize the common elements or variables in abstract class
    we are putting rule for the constructor
    */
    /*
    public Database(String name){

    }
    */
protected ArrayList<String> names = new ArrayList<>();

//    Rules for database
// 1.Rule
    abstract void save(String name);
// 2.Rule
    abstract void delete(String name);
// 3.Rule
    abstract void update(String oldName,String newName);
}
