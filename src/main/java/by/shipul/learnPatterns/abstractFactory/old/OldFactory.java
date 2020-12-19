package by.shipul.learnPatterns.abstractFactory.old;

import by.shipul.learnPatterns.abstractFactory.Chair;
import by.shipul.learnPatterns.abstractFactory.FurnitureFactory;
import by.shipul.learnPatterns.abstractFactory.Sofa;
import by.shipul.learnPatterns.abstractFactory.Table;

public class OldFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }

    @Override
    public Table createTable() {
        return new OldTable();
    }
}
