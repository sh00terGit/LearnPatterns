package by.shipul.learnPatterns.factoryMethod;

public class Auto implements Transport{

    public Auto() {
    }

    @Override
    public void deliver() {
        System.out.println("deliver by auto");
    }
}
