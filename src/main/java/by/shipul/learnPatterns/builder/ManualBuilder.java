package by.shipul.learnPatterns.builder;

import by.shipul.learnPatterns.exceptions.UnsupportedOperationException;

public class ManualBuilder implements Builder{

    Manual manual;


    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSits(int number) {
        manual.setManualSits("sits number is "+Integer.toString(number));
    }

    @Override
    public void setEngine(EngineType engine) {
        manual.setInformationAboutEnjine("Engine : "+ engine.toString());
    }

    @Override
    public void setTripComputer() {
      try{
          throw new UnsupportedOperationException();
      }catch (UnsupportedOperationException e) {
          System.err.println(e.getMessage());
      }
    }

    @Override
    public void setPrivod(PrivodType privod) {
        manual.setInformationAboutWD("privod is "+ privod.toString());
    }

    public Manual getResult() {
        return manual;
    }
}

