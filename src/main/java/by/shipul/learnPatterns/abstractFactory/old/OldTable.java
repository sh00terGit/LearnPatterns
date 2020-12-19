package by.shipul.learnPatterns.abstractFactory.old;

import by.shipul.learnPatterns.abstractFactory.Table;

public class OldTable implements Table {
    @Override
    public void writeOnTable() {
        System.out.println("write on old table");
    }

    @Override
    public void haveDinnerOnTable() {
        System.out.println("have a dinner on old table");
    }
}
