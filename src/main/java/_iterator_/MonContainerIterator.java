package _iterator_;

public class MonContainerIterator implements MyIterator {

    private MonContainer monContainer;
    private int position = 0;

    public MonContainerIterator(MonContainer monContainer) {
        this.monContainer = monContainer;
    }

    @Override
    public boolean hasNext() {
        return position < monContainer.size();
    }

    @Override
    public String next() {
        return monContainer.get(position++);
    }
}
