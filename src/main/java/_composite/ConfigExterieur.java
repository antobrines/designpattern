package _composite;

import java.util.List;

public class ConfigExterieur {
    public static void main(String[] args) {
        Application application = new Application();
        CompositeNotifier compositeNotifier = new CompositeNotifier(
                List.of(new SmsNotifier(), new MailNotifier())
        );
        application.setNotifier(compositeNotifier);

        application.traitement();
    }
}
