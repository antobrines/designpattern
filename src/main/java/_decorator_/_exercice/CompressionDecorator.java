package _decorator_._exercice;

public class CompressionDecorator extends FileDataSourceDecorator {
    private Compressor compressor = new Compressor();

    CompressionDecorator(FileDataSourceInterface source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressor.compress(data));
    }

    @Override
    public String readData() {
        return compressor.decompress(super.readData());
    }
}
