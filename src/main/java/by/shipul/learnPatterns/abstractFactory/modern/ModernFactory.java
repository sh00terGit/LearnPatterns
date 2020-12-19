package by.shipul.learnPatterns.abstractFactory.modern;

import by.shipul.learnPatterns.abstractFactory.Chair;
import by.shipul.learnPatterns.abstractFactory.FurnitureFactory;
import by.shipul.learnPatterns.abstractFactory.Sofa;
import by.shipul.learnPatterns.abstractFactory.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
