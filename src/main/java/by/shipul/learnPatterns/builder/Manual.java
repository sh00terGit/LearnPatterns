package by.shipul.learnPatterns.builder;

public class Manual {


    private String manualSits;
    private String informationAboutWD;
    private String informationAboutEnjine;
    private String informationAboutTripComputer;


    public String getManualSits() {
        return manualSits;
    }

    public void setManualSits(String manualSits) {
        this.manualSits = manualSits;
    }

    public String getInformationAboutWD() {
        return informationAboutWD;
    }

    public void setInformationAboutWD(String informationAboutWD) {
        this.informationAboutWD = informationAboutWD;
    }

    public String getInformationAboutEnjine() {
        return informationAboutEnjine;
    }

    public void setInformationAboutEnjine(String informationAboutEnjine) {
        this.informationAboutEnjine = informationAboutEnjine;
    }

    public String getInformationAboutTripComputer() {
        return informationAboutTripComputer;
    }

    public void setInformationAboutTripComputer(String informationAboutTripComputer) {
        this.informationAboutTripComputer = informationAboutTripComputer;
    }


    @Override
    public String toString() {
        return "Manual{" +
                "manualSits='" + manualSits + '\'' +
                ", informationAboutWD='" + informationAboutWD + '\'' +
                ", informationAboutEnjine='" + informationAboutEnjine + '\'' +
                ", informationAboutTripComputer='" + informationAboutTripComputer + '\'' +
                '}';
    }
}
