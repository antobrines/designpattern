package _decorator_.basic;

public class Application {

    private SmsNotifier smsNotifier;
    private MailNotifier mailNotifier;
    private SlackNotifier slackNotifier;

    private int param;

    public void traitement() {
        switch (param) {
            case 0:
                smsNotifier.sendSms();
                break;
            case 1:
                mailNotifier.sendMail();
                break;
            case 2:
                slackNotifier.sendSlack();
                break;
        }
    }


}
