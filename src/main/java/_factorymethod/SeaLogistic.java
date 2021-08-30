package _factorymethod;

public class SeaLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Bateau();
    }
}
