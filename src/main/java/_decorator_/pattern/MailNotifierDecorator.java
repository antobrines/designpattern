package _decorator_.pattern;

public class MailNotifierDecorator extends BaseDecoratorNotifier {

    public MailNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyUser() {
        this.wrappee.notifyUser();
        System.out.println("envoyer mail");
    }

}
