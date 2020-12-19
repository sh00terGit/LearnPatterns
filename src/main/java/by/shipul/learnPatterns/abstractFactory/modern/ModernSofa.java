package by.shipul.learnPatterns.abstractFactory.modern;

import by.shipul.learnPatterns.abstractFactory.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lay() {
        System.out.println("lay on modern sofa");
    }

    @Override
    public void sleep() {
        System.out.println("sleep on modern sofa");
    }
}
