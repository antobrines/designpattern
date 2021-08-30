package _factorymethod;

public class RoadLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Camion();
    }
}
