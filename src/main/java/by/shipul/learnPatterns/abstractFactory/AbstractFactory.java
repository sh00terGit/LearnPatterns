package by.shipul.learnPatterns.abstractFactory;

public class AbstractFactory {


    public static void main (String [] args){
        // modern client
        Client modernClient = new Client(FurnitureType.MODERN);
        modernClient.getTable().writeOnTable();

        //old client

        Client oldClient = new Client(FurnitureType.OLD);
        oldClient.getTable().writeOnTable();

        Client unsupportedClient = new Client(FurnitureType.LOFT);

    }
}
