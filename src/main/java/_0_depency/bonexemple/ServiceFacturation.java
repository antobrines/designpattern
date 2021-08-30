package _0_depency.bonexemple;

public class ServiceFacturation {

    private Database database;

    public ServiceFacturation(Database database) {
        this.database = database;
    }

    public void facturer() {
        Detail detail = database.loadDetail();
        // ...TODO facturation
    }
}
