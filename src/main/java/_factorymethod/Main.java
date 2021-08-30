package _factorymethod;

public class Main {
    public static void main(String[] args) {

        Logistic logistic = new RoadLogistic();
        //OU
        logistic = new SeaLogistic();

        PlanLogistic planLogistic = logistic.createPlanLogistic();
    }
}
