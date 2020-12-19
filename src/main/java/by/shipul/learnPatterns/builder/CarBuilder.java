package by.shipul.learnPatterns.builder;

public class CarBuilder implements Builder{

    Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSits(int number) {
        car.setSits(number);
    }

    @Override
    public void setEngine(EngineType engine) {
        car.setEnjine(engine);
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("default trip computer");
    }

    @Override
    public void setPrivod(PrivodType privod) {
        car.setPrivod(privod);
    }

    public Car getResult() {
        return car;
    }
}
