package by.shipul.learnPatterns.abstractFactory.old;

import by.shipul.learnPatterns.abstractFactory.Chair;

public class OldChair implements Chair {
    @Override
    public boolean hasLegs() {
        return  true;
    }

    @Override
    public void sitOn() {
        System.out.println("sit on old chair");
    }
}
