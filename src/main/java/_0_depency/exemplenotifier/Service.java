package _0_depency.exemplenotifier;

public class Service {

    private NotificationService notificationService;

    public Service(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void traitement() {
        notificationService.notifier();
    }
}
