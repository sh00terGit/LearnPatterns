package by.shipul.learnPatterns.factoryMethod;

public class AutoLogistics extends Logistics{


    @Override
    public Transport createTransport() {
        return new Auto();
    }
}
