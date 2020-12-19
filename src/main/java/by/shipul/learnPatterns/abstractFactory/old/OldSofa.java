package by.shipul.learnPatterns.abstractFactory.old;

import by.shipul.learnPatterns.abstractFactory.Sofa;

public class OldSofa implements Sofa {
    @Override
    public void lay() {
        System.out.println("lay on old sofa");
    }

    @Override
    public void sleep() {
        System.out.println("sleep on old sofa");
    }
}
