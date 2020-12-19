package by.shipul.learnPatterns.builder;

public class Car {

     private int sits;
     private EngineType enjine;
     private String tripComputer;
     private PrivodType privod;


    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public EngineType getEnjine() {
        return enjine;
    }

    public void setEnjine(EngineType enjine) {
        this.enjine = enjine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public PrivodType getPrivod() {
        return privod;
    }

    public void setPrivod(PrivodType privod) {
        this.privod = privod;
    }


    @Override
    public String toString() {
        return "Car{" +
                "sits=" + sits +
                ", enjine=" + enjine +
                ", tripComputer='" + tripComputer + '\'' +
                ", privod=" + privod +
                '}';
    }
}
