package _decorator_.pattern;

public class Application {

    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void traitement() {
        notifier.notifyUser();
    }


}
