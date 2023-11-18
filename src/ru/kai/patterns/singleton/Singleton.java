package ru.kai.patterns.singleton;

// Одиночка на стероидах
public class Singleton {
    private static volatile Singleton instance;
    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}
