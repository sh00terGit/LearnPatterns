package by.shipul.learnPatterns.builder;

public class Director {

    public static void constructSportCar(Builder builder) {
        builder.reset();
        builder.setPrivod(PrivodType.WD4);
        builder.setEngine(EngineType.BENSIN);
        builder.setSits(1);
        builder.setTripComputer();
    }


    public static void constructTrackCar(Builder builder) {
        builder.reset();
        builder.setPrivod(PrivodType.WD2);
        builder.setEngine(EngineType.DIESEL);
        builder.setSits(4);
    }


}
