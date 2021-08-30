package _decorator_.pattern;

public class SmsNotifierDecorator extends BaseDecoratorNotifier {

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyUser() {
        this.wrappee.notifyUser();
        System.out.println("envoyer sms");
    }

}
