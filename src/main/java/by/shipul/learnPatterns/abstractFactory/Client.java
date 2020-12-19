package by.shipul.learnPatterns.abstractFactory;

import by.shipul.learnPatterns.abstractFactory.modern.ModernFactory;
import by.shipul.learnPatterns.abstractFactory.old.OldFactory;
import by.shipul.learnPatterns.exceptions.UnsupportedOperationException;

public class Client {

    FurnitureFactory factory;
    Chair chair;
    Sofa sofa;
    Table table;


    public Sofa getSofa() {
        return factory.createSofa();
    }

    public Table getTable() {
        return factory.createTable();
    }


    public Client(FurnitureFactory factory) {
        this.factory = factory;
    }


    public Client(FurnitureType type) {
        try {
            setFactory(type);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

    }

    private void setFactory(FurnitureType type) throws UnsupportedOperationException {
        switch (type) {
            case OLD:
                this.factory = new OldFactory();
                break;
            case MODERN:
                this.factory = new ModernFactory();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Chair getChair(){
       return factory.createChair();

    }

}
