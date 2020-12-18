package by.shipul.learnPatterns.factoryMethod;

public class Ship implements Transport {

    public Ship() {
    }

    @Override
    public void deliver() {
        System.out.println("deliver by ship");
    }
}
