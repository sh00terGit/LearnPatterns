package by.shipul.learnPatterns.abstractFactory.modern;

import by.shipul.learnPatterns.abstractFactory.Table;

public class ModernTable implements Table {

    @Override
    public void writeOnTable() {
        System.out.println("write on modern table");
    }

    @Override
    public void haveDinnerOnTable() {
        System.out.println("have a dinner on modern table");
    }
}
