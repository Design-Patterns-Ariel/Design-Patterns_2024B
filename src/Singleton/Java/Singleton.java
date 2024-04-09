package Singleton.Java;

public class Singleton {

    private static Singleton singleton = null;

    public static Singleton egetInstance() {

        Singleton singleton = new Singleton();

        return singleton;
    }
    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }

    private Singleton() {
    }
}
