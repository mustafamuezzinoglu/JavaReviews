package week18_01_07_2023.abstraction;

public class TestOracle {

    public static void main(String[] args) {


        OracleDatabase oracleDatabase = new OracleDatabase();
        oracleDatabase.save("Adam");
        System.out.println(oracleDatabase.names);
        oracleDatabase.save("Harun");
        System.out.println(oracleDatabase.names);
        oracleDatabase.delete("Adam");
        System.out.println(oracleDatabase.names);

        oracleDatabase.update("Harun","Doguhan");
        System.out.println(oracleDatabase.names);
    }
}
