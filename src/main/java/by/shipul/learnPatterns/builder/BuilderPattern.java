package by.shipul.learnPatterns.builder;

/**
 * Строитель — это порождающий паттерн проектирования, который
 * позволяет создавать сложные объекты пошагово. Строитель даёт
 * возможность использовать один и тот же код строительства для
 * получения разных представлений объектов.
 *
 * Используется :
 * 1) нужно избавиться от большого коструктора или множества с различными параметрами
 * 2) нужно создавать разные представления одного и того же (легковушка или трак)
 */

public class BuilderPattern {


    public static void main(String [] args) {

        CarBuilder carBuilder = new CarBuilder();
        Director.constructSportCar(carBuilder);
        Car car = carBuilder.getResult();
        Director.constructTrackCar(carBuilder);
        Car track = carBuilder.getResult();

        ManualBuilder manualBuilder = new ManualBuilder();
        Director.constructSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        Director.constructTrackCar(manualBuilder);
        Manual manualTrack = manualBuilder.getResult();

        System.out.println(car.toString());
        System.out.println(manual.toString());

        System.out.println(track.toString());
        System.out.println(manualTrack.toString());
    }
}
