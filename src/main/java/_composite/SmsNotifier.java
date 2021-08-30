package _composite;

public class SmsNotifier implements Notifier {
    @Override
    public void notifyUser() {
        System.out.println("sms");
    }

}
