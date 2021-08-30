package _observator_;

public interface Publisher {
    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);

    void notifySubscribers(Object o);
}
