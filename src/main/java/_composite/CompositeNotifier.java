package _composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeNotifier implements Notifier {

    private List<Notifier> children = new ArrayList<>();

    public CompositeNotifier(List<Notifier> children) {
        this.children = children;
    }

    @Override
    public void notifyUser() {
        for (Notifier child : children) {
            child.notifyUser();
        }
    }
}
