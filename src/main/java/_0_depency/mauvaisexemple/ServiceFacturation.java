package _0_depency.mauvaisexemple;

public class ServiceFacturation {

    private MySQLDatabase mySQLDatabase = new MySQLDatabase();

    public void facturer() {
        Detail detail = mySQLDatabase.loadDetail();
        // ...TODO facturation
    }
}
