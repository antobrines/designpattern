package _factorymethod;

public abstract class Logistic {

    public PlanLogistic createPlanLogistic() {
        PlanLogistic planLogistic = new PlanLogistic();
        //...

        planLogistic.addTransport(createTransport());

        return planLogistic;
    }

    abstract Transport createTransport();
}
