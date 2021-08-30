package _decorator_.intermediare;

public class ConfigExterieur {
    public static void main(String[] args) {
        Application application = new Application();
        application.setNotifier(new SmsNotifier());
    }
}
