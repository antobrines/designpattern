package _decorator_.pattern;

public class SlackNotifierDecorator extends BaseDecoratorNotifier {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyUser() {
        this.wrappee.notifyUser();
        System.out.println("envoyer slack");
    }

}
