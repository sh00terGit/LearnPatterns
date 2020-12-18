package by.shipul.learnPatterns.factoryMethod;

public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
