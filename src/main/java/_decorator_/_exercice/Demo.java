package _decorator_._exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compresser
        String data = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        Encryptor encryptor = new Encryptor();
        Compressor compressor = new Compressor();
        String encrypted = encryptor.encode(data);
        String encryptedAndCompressed = compressor.compress(encrypted);
        fileDataSource.writeData(encryptedAndCompressed);

        //TODO refactoriser en utilisant le pattern decorator

        String readData = fileDataSource.readData();

        System.out.println("- Input ----------------");
        System.out.println(data);
        System.out.println("- Encoded --------------");
        System.out.println(readData);
        System.out.println("- Decoded --------------");
        System.out.println(encryptor.decode(compressor.decompress(readData)));

        System.out.println("- With Decorator ----------------");



        FileDataSourceInterface fileDataSourceBis = new EncryptionDecorator(new CompressionDecorator(new FileDataSource("OutputDemo.txt")));

        String decoded = fileDataSourceBis.readData();

        System.out.println("- Input ----------------");
        System.out.println(data);
        System.out.println("- decoded --------------");
        System.out.println(decoded);
        // Encrypting data and writing it
        fileDataSourceBis.writeData(data);
    }
}