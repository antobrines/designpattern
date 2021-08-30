package _0_depency.bonexemple;


public class Main {

    public static void main(String[] args) {
        Database database = args[0] == "xml" ? new XmlDatabase() : new MySQLDatabase();
        ServiceFacturation serviceFacturation = new ServiceFacturation(database);
        serviceFacturation.facturer();
    }

}
