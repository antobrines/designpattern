package _observator_;

public class LogSubscriber implements Subscriber {
    @Override
    public void update(Object o) {
        System.out.println(o);
    }
}
