package by.shipul.learnPatterns.factoryMethod;

/**
 * Определяет интерфейс для создания объекта, но оставляет подклассам решение о том, на основании какого
 * класса создавать объект. Фабричный метод позволяет классу делегировать создание подклассов.
 * Используется, когда:
 *
 * 1)классу заранее неизвестно, объекты каких подклассов ему нужно создавать.
 * 2)класс спроектирован так, чтобы объекты, которые он создаёт, специфицировались подклассами.
 * 3)класс делегирует свои обязанности одному из нескольких вспомогательных подклассов,
 * и планируется локализовать знание о том, какой класс принимает эти обязанности на себя.
 */
public class FactoryMethod {

    public static void main(String [] args) {
        Logistics [] logistics =  {new AutoLogistics() , new SeaLogistics()};
        for (Logistics logistic : logistics) {
            logistic.createTransport().deliver();
        }
    }
}
