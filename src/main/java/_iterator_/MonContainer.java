package _iterator_;

public class MonContainer implements MyIterable {

    private String[] data = new String[10];
    private int position = 0;

    public void add(String e) {
        if (position >= data.length) {
            // probleme
            String[] data2 = new String[data.length + 10];
            for (int i = 0; i < data.length; i++) {
                data2[i] = this.data[i];
            }
            this.data = data2;
        }
        this.data[position] = e;
        this.position = this.position + 1;
    }

    public int size() {
        return position;
    }

    public String get(int i) {
        return this.data[i];
    }

    @Override
    public MyIterator createIterator() {
        return new MonContainerIterator(this);
    }
}
