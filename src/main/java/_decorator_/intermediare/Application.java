package _decorator_.intermediare;

public class Application {

    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void traitement() {
        notifier.notifyUser();
    }


}
