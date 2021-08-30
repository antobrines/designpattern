package _decorator_.pattern;

public class ConfigExterieur {
    public static void main(String[] args) {

        Application application = new Application();

        application.setNotifier(new SmsNotifierDecorator(new MailNotifierDecorator(new SlackNotifierDecorator(new NoneNotifier()))));

        application.traitement();
    }
}
