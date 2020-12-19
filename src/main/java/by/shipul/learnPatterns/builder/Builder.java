package by.shipul.learnPatterns.builder;

public interface Builder {

    void reset();
    void setSits(int number);
    void setEngine(EngineType engine);
    void setTripComputer();
    void setPrivod(PrivodType privod);

}
