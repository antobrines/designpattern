package _observator_;

import java.util.ArrayList;
import java.util.List;

public class Anchor implements Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber s) {

    }

    @Override
    public void removeSubscriber(Subscriber s) {

    }

    @Override
    public void notifySubscribers(Object o) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(o);
        }
    }

    public void click() {
        this.notifySubscribers(null);
    }
}
