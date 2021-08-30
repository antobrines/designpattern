package _observator_;

import java.util.ArrayList;
import java.util.List;

public class Button implements Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(Object o) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(o);
        }
    }

    public void click() {
        //this.notifySubscribers(null);
    }
}
