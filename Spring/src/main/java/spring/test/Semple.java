package spring.test;

/**
 * Created by admin on 28.04.2018.
 */
public class Semple {
    private static int constructorCounter = 0;
    private int counter = 0;

    public Semple() {
        constructorCounter++;
    }

    public int getConstructorCounter() {
        return constructorCounter;
    }

    public int getCounter() {
        return ++counter;
    }
}
