package by.shipul.learnPatterns.abstractFactory.modern;

import by.shipul.learnPatterns.abstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit ob Modern chair");
    }
}
