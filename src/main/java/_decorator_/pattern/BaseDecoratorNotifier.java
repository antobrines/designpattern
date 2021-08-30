package _decorator_.pattern;

public abstract class BaseDecoratorNotifier implements Notifier {

    protected Notifier wrappee;

    public BaseDecoratorNotifier(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public abstract void notifyUser();

}
