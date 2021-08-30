package _decorator_._exercice;

public abstract class FileDataSourceDecorator implements FileDataSourceInterface {
    protected FileDataSourceInterface source;

    FileDataSourceDecorator(FileDataSourceInterface source) {
        this.source = source;
    }

    public void writeData(String data) {
        source.writeData(data);
    }

    public String readData() {
        return source.readData();
    }
}
